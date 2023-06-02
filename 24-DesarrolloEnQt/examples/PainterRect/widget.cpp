#include "widget.h"
#include "ui_widget.h"

Widget::Widget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Widget)
{
    ui->setupUi(this);
}

Widget::~Widget()
{
    delete ui;
}

void Widget::paintEvent(QPaintEvent *e)
{
    // Creo un pintor
    QPainter painter(this);
    // Este pintor se encarga de pintar... algo
    painter.drawRect(10,50,100,30);

}
