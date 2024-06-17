// Archivo base para pruebas de etapa 3.1

enum Estado { Neutro, Feliz, Triste, Hambriento, Enojado, Cansado, Muerto };

int main() {
    // Crear y mostrar estado inicial de la mascota
    Mascota miMascota("Garfield");
    miMascota.mostrarEstado();

    // Crear instancias de ítems
    Comida queso(1, "Queso", 5);
    Medicina jarabe(2, "Jarabe", 3);
    Juguete pelota(3, "Pelota", -1);  // Juguete ilimitado

    // Mostrar información de ítems
    queso.mostrarItem();
    jarabe.mostrarItem();
    pelota.mostrarItem();

    // Usar ítems en la mascota y mostrar su estado después de cada uso
    queso.usar(miMascota);
    jarabe.usar(miMascota);
    pelota.usar(miMascota);

    return 0;
}