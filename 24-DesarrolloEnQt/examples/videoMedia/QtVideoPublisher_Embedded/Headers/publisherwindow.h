
#ifndef PUBLISHERWINDOW_H
#define PUBLISHERWINDOW_H

#include <QMainWindow>

QT_BEGIN_NAMESPACE
namespace Ui { class PublisherWindow; }
QT_END_NAMESPACE

class PublisherWindow : public QMainWindow {
    Q_OBJECT

public:
    explicit PublisherWindow(QWidget *parent = nullptr);
    ~PublisherWindow();

signals:
    void urlPublished(const QString &url);

private slots:
    void on_publishButton_clicked();

private:
    Ui::PublisherWindow *ui;
};

#endif // PUBLISHERWINDOW_H
