
#include "subscriberwindow.h"
#include "ui_subscriberwindow.h"
#include <QWebEngineView>

SubscriberWindow::SubscriberWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::SubscriberWindow) {
    ui->setupUi(this);
    currentUrl = "";
    ui->openVideoButton->setEnabled(false);
    videoView = nullptr;
}

SubscriberWindow::~SubscriberWindow() {
    delete ui;
}

void SubscriberWindow::updateUrl(const QString &url) {
    currentUrl = url;
    ui->openVideoButton->setText("Ver video");
    ui->openVideoButton->setEnabled(true);
}

void SubscriberWindow::on_openVideoButton_clicked() {
    if (!currentUrl.isEmpty()) {
        if (!videoView) {
            videoView = new QWebEngineView(this);
            videoView->resize(800, 600);
        }
        videoView->load(QUrl(currentUrl));
        videoView->show();
    }
}
