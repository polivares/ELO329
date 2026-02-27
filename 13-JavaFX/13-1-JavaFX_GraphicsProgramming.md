---
marp: true
paginate: true
---

# ELO329 - Diseño y Programación Orientados a Objetos
## Clase 13-1 - JavaFX: Programación de Interfaces Gráficas

Agustín González  
Patricio Olivares

Este material ha sido preparado desde varias fuentes, entre ellas el material
del Dr. Paul Fodor, Stony Brook University.

---

## Contexto y evolución

- Java comenzó con AWT (Abstract Window Toolkit), que delegaba a componentes nativos del sistema operativo.
- Luego se introdujo Swing, más flexible y portable.
- Finalmente se introdujo JavaFX, orientado a interfaces modernas, animaciones y gráficos.
- Desde Java 11, **JavaFX no viene incluido por defecto**. Debe instalarse por separado como módulo.

---

## Instalación de JavaFX

- Sitio oficial: [https://gluonhq.com/products/javafx/](https://gluonhq.com/products/javafx/)
- Documentación: [https://openjfx.io/openjfx-docs/](https://openjfx.io/openjfx-docs/)
- Compilación desde consola:
```bash
javac --module-path <ruta>/javafx-sdk-17/lib --add-modules javafx.controls Main.java
java  --module-path <ruta>/javafx-sdk-17/lib --add-modules javafx.controls Main
```

---

## Estructura básica de una aplicación JavaFX

- Extiende la clase `Application`.
- El método `start(Stage primaryStage)` define el comportamiento de la interfaz.
- Componentes principales:
  - `Stage`: ventana principal.
  - `Scene`: contenido dentro de la ventana.
  - `Node`: elemento gráfico (botón, texto, imagen, etc.).

---

## Ejemplo básico

```java
Button btOK = new Button("OK");
Scene scene = new Scene(btOK, 200, 250);
primaryStage.setScene(scene);
primaryStage.show();
```

---

## Panes de diseño (Layout Panes)

- Estructuras contenedoras que organizan elementos gráficos.
- Tipos más comunes:
  - `StackPane`, `FlowPane`, `GridPane`
  - `HBox`, `VBox`, `BorderPane`
- Permiten componer interfaces más complejas y ordenadas.

---

## Coordenadas y gráficos

- El sistema de coordenadas comienza en la **esquina superior izquierda**.
- Se pueden usar métodos como `bind()` para posicionar elementos de forma relativa.

---

## Mostrar imágenes

- Uso de las clases `Image` e `ImageView`.
- Permiten mostrar imágenes, escalar, girar y manipular visualmente.
- Se pueden tener múltiples vistas (`ImageView`) de una misma `Image`.

---

## Dibujar formas básicas (Shapes)

- JavaFX permite representar formas como:
  - `Circle`, `Rectangle`, `Line`, `Polygon`, `Polyline`, `Text`
- Estas formas permiten crear visualizaciones personalizadas.

---

## Herramientas adicionales

- **Scene Builder**: editor visual de interfaces JavaFX.
- Aunque se puede usar Scene Builder, se recomienda aprender primero desde código para entender mejor el modelo de eventos y estructura.
- IntelliJ soporta JavaFX directamente (requiere configuración del SDK externo).

---
