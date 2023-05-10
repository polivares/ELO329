#include<string>

class Automobile{
    public:
        Automobile(); // Constructor de clase Automobile
        Automobile(std::string make, int doors, int cylinders,
                   int engineSize=2);
        Automobile(const Automobile &a);
        void input();
        void set_NumDoors(int doors);
        // Const es la palabra reservada para
        // "constantes". En este contexto,
        // const se utiliza para indicar de manera 
        // explícita que una función miembro no
        // modificará ningún atributo de la clase
        void display() const;
        int get_NumDoors() const;
        ~Automobile(); // Este es el método destructor
    private:
        std::string make;
        int numDoors;
        int numCylinders;
        int engineSize;
};
