#include "widget.h"
#include "ui_widget.h"
#include "tempconverter.h"

Widget::Widget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Widget)
{
    ui->setupUi(this);
    tConverter = new TempConverter();
    connect(ui->celsiusDial,SIGNAL(valueChanged(int)),tConverter,SLOT(setTempCelsius(int)));
    connect(ui->fahrenheitDial,SIGNAL(valueChanged(int)),tConverter,SLOT(setTempFahrenheit(int)));
    connect(tConverter,SIGNAL(tempCelsiusChanged(int)),ui->celsiusDial,SLOT(setValue(int)));
    connect(tConverter,SIGNAL(tempFahrenheitChanged(int)),ui->fahrenheitDial,SLOT(setValue(int)));
}

Widget::~Widget()
{
    delete ui;
    delete tConverter;
}
