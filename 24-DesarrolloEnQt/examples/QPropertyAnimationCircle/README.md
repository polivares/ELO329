# QPropertyAnimationCircle

Ejemplo mínimo de Qt 6 que anima un rectángulo dentro de una `QGraphicsScene`.

La animación modifica la propiedad `"pos"` de un `QGraphicsObject` usando `QPropertyAnimation`.
Los keyframes aproximan una trayectoria circular, similar al ejemplo `PathTransitionDemo` visto en JavaFX.

Archivos principales:

- `animatedrect.h`: declara el item gráfico animable.
- `animatedrect.cpp`: define cómo se dibuja el rectángulo.
- `main.cpp`: crea la escena y configura la animación.

## Compilar desde consola

```bash
cmake -S . -B build
cmake --build build
./build/QPropertyAnimationCircle
```

También se puede abrir `CMakeLists.txt` directamente desde Qt Creator.
