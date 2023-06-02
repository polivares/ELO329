#ifndef TEMPCONVERTER_H
#define TEMPCONVERTER_H

#include <QObject>

class TempConverter : public QObject
{
    Q_OBJECT
public:
    TempConverter(int tempCelsius = 0, QObject *parent = 0);

    int tempCelsius();
    int tempFahrenheit();

signals:
    void tempCelsiusChanged(int);
    void tempFahrenheitChanged(int);

public slots:
    void setTempCelsius(int);
    void setTempFahrenheit(int);

private:
    float m_tempCelsius;
};

#endif // TEMPCONVERTER_H
