#ifndef ANIMATEDRECT_H
#define ANIMATEDRECT_H

#include <QGraphicsObject>

class AnimatedRect : public QGraphicsObject {
    // Macro de Qt necesaria para activar el sistema de metaobjetos.
    // En este ejemplo permite que la propiedad "pos", heredada desde Qt,
    // pueda ser usada por QPropertyAnimation.
    Q_OBJECT

public:
    // explicit evita conversiones implícitas hacia AnimatedRect.
    // Aquí es una práctica común en constructores de un solo argumento.
    // nullptr representa "sin padre" cuando no se entrega un QGraphicsItem.
    explicit AnimatedRect(QGraphicsItem *parent = nullptr);

    // override indica que estos métodos reemplazan métodos virtuales
    // heredados desde QGraphicsObject. El compilador revisa que la firma calce.
    QRectF boundingRect() const override;
    void paint(QPainter *painter,
               const QStyleOptionGraphicsItem *option,
               QWidget *widget) override;
};

#endif
