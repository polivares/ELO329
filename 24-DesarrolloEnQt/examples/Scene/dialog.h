#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>
#include <QtCore>
#include <QtGui>
#include <QGraphicsScene>
#include <QGraphicsRectItem>
#include "qascensor.h"

namespace Ui {
class Dialog;
}

class Dialog : public QDialog
{
    Q_OBJECT

public:
    Dialog(QWidget *parent = 0);
    ~Dialog();

private slots:
    // Slots de botones usados en la clase Dialog
    void start();
    void stop();

private:
    Ui::Dialog *ui;
    QGraphicsScene *scene;
    // Mi QGraphicItem
    QAscensor *asc;
    QTimer *timer = new QTimer(this);
};

#endif // DIALOG_H
