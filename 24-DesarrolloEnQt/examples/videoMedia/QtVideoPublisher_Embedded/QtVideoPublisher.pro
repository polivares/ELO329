
QT += core gui widgets webenginewidgets

TARGET = QtVideoPublisher
TEMPLATE = app

SOURCES += Sources/main.cpp \
           Sources/publisherwindow.cpp \
           Sources/subscriberwindow.cpp

HEADERS += Headers/publisherwindow.h \
           Headers/subscriberwindow.h

FORMS += Forms/publisherwindow.ui \
         Forms/subscriberwindow.ui
