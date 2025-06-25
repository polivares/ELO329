#include <iostream>
#include "Movimiento.h"
#include "Pokemon.h"
#include "Tipo.h"

int main() {
    //Creación de tipos.
    std::vector<Tipo> types;
    types.push_back(Tipo("Agua", {"Fuego", "Agua"}, {"Eléctrico"}, {}));
    types.push_back(Tipo("Eléctrico", {"Agua", "Volador"}, {"Tierra"}, {}));
    types.push_back(Tipo("Tierra", {"Fuego", "Eléctrico"}, {"Agua", "Hielo"}, {"Eléctrico"}));
    types.push_back(Tipo("Hielo", {"Tierra", "Volador"}, {"Fuego"}, {}));
    types.push_back(Tipo("Normal", {}, {}, {}));
    types.push_back(Tipo("Volador", {}, {"Eléctrico", "Hielo"}, {"Tierra"}));
    types.push_back(Tipo("Fuego", {"Hielo"}, {"Agua", "Tierra"}, {}));

    //Creación de movimientos.
    std::vector<Movimiento*> moves;
    moves.push_back(new Ataque("Ataque", types[4]));
    moves.push_back(new Ventaja("Ventaja", types[4]));
    moves.push_back(new Desventaja("Desventaja", types[4]));
    moves.push_back(new Curacion("Curación", types[4]));

    //Creación de los pokemon
    std::vector<Pokemon> pokes;
    pokes.push_back(Pokemon("Piplup", 75, 60, 70, 5, {types[0]}, moves));
    pokes.push_back(Pokemon("Pachirisu", 50, 120, 40, 30, {types[1]}, moves));
    pokes.push_back(Pokemon("Mamoswine", 150, 90, 90, 40, {types[2], types[3]}, moves));
    pokes.push_back(Pokemon("Togekiss", 70, 90, 110, 38, {types[4], types[5]}, moves));
    pokes.push_back(Pokemon("Buneary", 60, 20, 70, 10, {types[4]}, moves));
    pokes.push_back(Pokemon("Quilava", 80, 100, 70, 20, {types[6]}, moves));

    for(int k = 0; k < 6; k++) {
        pokes[k].imprimir();
    }
    return 0;

}