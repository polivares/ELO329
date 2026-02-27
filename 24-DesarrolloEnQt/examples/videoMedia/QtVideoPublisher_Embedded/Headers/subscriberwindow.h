
#ifndef SUBSCRIBERWINDOW_H
#define SUBSCRIBERWINDOW_H

#include <QMainWindow>
#include <QString>

class QWebEngineView;

QT_BEGIN_NAMESPACE
namespace Ui { class SubscriberWindow; }
QT_END_NAMESPACE

class SubscriberWindow : public QMainWindow {
    Q_OBJECT

public:
    explicit SubscriberWindow(QWidget *parent = nullptr);
    ~SubscriberWindow();

public slots:
    void updateUrl(const QString &url);

private slots:
    void on_openVideoButton_clicked();

private:
    Ui::SubscriberWindow *ui;
    QString currentUrl;
    QWebEngineView *videoView;
};

#endif // SUBSCRIBERWINDOW_H
