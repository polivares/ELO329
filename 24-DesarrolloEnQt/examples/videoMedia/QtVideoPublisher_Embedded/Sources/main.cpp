
#include <QApplication>
#include "publisherwindow.h"
#include "subscriberwindow.h"

int main(int argc, char *argv[]) {
    QApplication app(argc, argv);

    PublisherWindow publisher;
    SubscriberWindow subscriber;

    QObject::connect(&publisher, &PublisherWindow::urlPublished,
                     &subscriber, &SubscriberWindow::updateUrl);

    publisher.show();
    subscriber.show();

    return app.exec();
}
