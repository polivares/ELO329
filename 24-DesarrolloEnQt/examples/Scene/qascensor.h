#ifndef QASCENSOR_H
#define QASCENSOR_H
#include <QPainter>
#include <QGraphicsRectItem>
#include <QGraphicsScene>

class QAscensor : public QGraphicsRectItem
{
public:
    QAscensor(int posX, int posY,int ancho, int alto);
    void paint(QPainter *painter, const QStyleOptionGraphicsItem *option, QWidget *widget);

protected:
    void advance(int phase);
private:
    int speed = -10;
};

#endif // QASCENSOR_H
