#include "qascensor.h"

QAscensor::QAscensor(int posX, int posY, int ancho, int alto):QGraphicsRectItem(posX,posY,ancho,alto)
{

}

void QAscensor::advance(int phase){
    if(!phase) return;
    setPos(mapToParent(0,-(speed)));
}

void QAscensor::paint(QPainter *painter, const QStyleOptionGraphicsItem *option, QWidget *widget){
    QRectF rect = this->rect();
    painter->drawRect(rect);
}
