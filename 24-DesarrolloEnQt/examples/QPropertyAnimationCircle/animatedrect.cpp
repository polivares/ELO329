#include "animatedrect.h"

#include <QColor>
#include <QPainter>
#include <QPen>

AnimatedRect::AnimatedRect(QGraphicsItem *parent)
    // Lista de inicialización: llama al constructor de la clase base
    // QGraphicsObject y le entrega el padre gráfico del item.
    : QGraphicsObject(parent)
{
}

QRectF AnimatedRect::boundingRect() const
{
    // El rectángulo se define centrado en (0, 0). Luego la propiedad "pos"
    // moverá el item completo dentro de la escena.
    return QRectF(-18, -12, 36, 24);
}

void AnimatedRect::paint(QPainter *painter,
                         const QStyleOptionGraphicsItem *,
                         QWidget *)
{
    // paint solo define cómo se ve el objeto. No calcula la animación.
    // El movimiento lo controla QPropertyAnimation en main.cpp.
    painter->setPen(QPen(Qt::black, 2));
    painter->setBrush(QColor(245, 156, 66));
    painter->drawRoundedRect(boundingRect(), 4, 4);
}
