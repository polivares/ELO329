
#include "publisherwindow.h"
#include "ui_publisherwindow.h"

PublisherWindow::PublisherWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::PublisherWindow) {
    ui->setupUi(this);
}

PublisherWindow::~PublisherWindow() {
    delete ui;
}

void PublisherWindow::on_publishButton_clicked() {
    QString url = ui->urlLineEdit->text();
    if (!url.isEmpty()) {
        emit urlPublished(url);
    }
}
