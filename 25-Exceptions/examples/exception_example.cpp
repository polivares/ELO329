#include <iostream>
#include <exception>
#include <string>

class MiExcepcion : public std::exception {
private:
    std::string mensaje;

public:
    explicit MiExcepcion(const std::string& mensaje) : mensaje(mensaje) {}

    const char* what() const noexcept {
        return mensaje.c_str();
    }
};

int main() {
    try {
        int divisor = 10;
        if (divisor == 0) {
            throw MiExcepcion("División por cero");
        } else {
            int resultado = 10 / divisor;
            std::cout << "Resultado: " << resultado << std::endl;
        }
    } catch (const MiExcepcion& e) {
        std::cout << "Excepción capturada: " << e.what() << std::endl;
    }
    return 0;
}






template <typename T> void display(const T &val){
    std::cout << val;
}