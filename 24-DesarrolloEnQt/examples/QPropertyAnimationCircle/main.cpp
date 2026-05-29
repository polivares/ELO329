#include "animatedrect.h"

#include <QApplication>
#include <QEasingCurve>
#include <QGraphicsScene>
#include <QGraphicsView>
#include <QPainter>
#include <QPen>
#include <QPropertyAnimation>

#include <cmath>

int main(int argc, char *argv[])
{
    QApplication app(argc, argv);

    QGraphicsScene scene;
    scene.setSceneRect(0, 0, 360, 260);

    const QPointF center(180, 130);
    const double radius = 80.0;

    QPen pathPen(Qt::darkGray, 2, Qt::DashLine);
    scene.addEllipse(center.x() - radius,
                     center.y() - radius,
                     radius * 2,
                     radius * 2,
                     pathPen);

    AnimatedRect *rect = new AnimatedRect;
    rect->setPos(center.x() + radius, center.y());
    scene.addItem(rect);

    // QPropertyAnimation modifica una propiedad Qt a lo largo del tiempo.
    // En este caso, el objeto animado es rect y la propiedad es "pos".
    // El tercer argumento indica el padre QObject de la animación.
    // Al usar rect como padre, Qt destruye la animación junto con rect.
    QPropertyAnimation *animation = new QPropertyAnimation(rect, "pos", rect);
    animation->setDuration(4000);
    // -1 significa repetir indefinidamente.
    animation->setLoopCount(-1);
    // Linear mantiene velocidad constante durante la animación.
    animation->setEasingCurve(QEasingCurve::Linear);

    const double pi = 3.14159265358979323846;
    const int steps = 16;

    // Los key values definen la ruta de la animación.
    // Cada valor t va de 0.0 a 1.0 y representa avance temporal.
    for (int i = 0; i <= steps; ++i) {
        const double t = i * 1.0 / steps;
        const double angle = 2.0 * pi * t;
        // cos y sin calculan puntos alrededor de una circunferencia.
        const QPointF point(center.x() + radius * std::cos(angle),
                            center.y() + radius * std::sin(angle));

        // setKeyValueAt asocia un avance temporal t con una posición.
        // Qt interpola automáticamente entre estos puntos.
        animation->setKeyValueAt(t, point);
    }

    QGraphicsView view(&scene);
    view.setRenderHint(QPainter::Antialiasing);
    view.setWindowTitle("QPropertyAnimation - movimiento circular");
    view.resize(380, 300);
    view.show();

    // Basta iniciar la animación. El event loop actualiza la escena.
    animation->start();

    return app.exec();
}
