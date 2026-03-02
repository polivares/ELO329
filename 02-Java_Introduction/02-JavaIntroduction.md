---
marp: true
paginate: true
---
# ELO329 - Diseño y Programación Orientados a Objetos
## 02 - Introducción a Java
Agustín González
Patricio Olivares

---

# Plataforma recomendada: Linux

En esta asignatura trabajaremos con **Linux** como entorno base.

¿Por qué?
- Mismo entorno para todos.
- Menos problemas de compatibilidad.
- Flujo de trabajo más simple para compilar y ejecutar.

Si usas Windows o macOS, debes asegurarte que tu código funciona en Linux.

---

# Plataforma recomendada: Linux
## Alternativas para usar Linux en otros entornos

- **WSL (Windows Subsystem for Linux)**: Linux dentro de Windows.
- **Máquina virtual**: Linux usando VirtualBox o VMware.
- **Dual boot**: Linux instalado junto a otro sistema operativo.
- **Live USB**: arrancar Linux desde pendrive sin instalar.

Idea práctica: elige la opción que te permita practicar cómodo y constante.

---

# Java: Motivaciones de su origen

En los años 90, Java nace con un objetivo claro:
**escribir una vez y correr en distintas plataformas**.

Se buscaba independencia de:
- tipo de computador,
- sistema operativo,
- sistema gráfico.

Nota histórica: cuando Java apareció (1995), Qt todavía no existía.

---

# Java: Motivaciones de su origen

Comparado con C++:
- C++ permite punteros explícitos (muy poderosos, pero delicados).
- Java evita esa complejidad para el programador inicial.
- Java también automatiza gran parte del manejo de memoria.

Resultado: menos errores clásicos al comenzar (por ejemplo, fugas de memoria).

---

# Independiente del computador y del sistema operativo

Esto se logra gracias a la **JVM (Java Virtual Machine)**.

- Una máquina virtual es una "máquina por software".
- Abstrae el hardware real.
- Permite ejecutar el mismo programa Java en distintos equipos.

Analogía: como correr el mismo juego en distintas consolas usando un emulador.

---

# Java Virtual Machine (JVM)

![JVM](imagenes/jvm.svg)

- Para cada combinación hardware + sistema operativo existe una JVM.
- El programa Java compilado a **bytecode** corre sobre esa JVM.
- Por eso, el mismo `.class` puede ejecutarse en plataformas distintas.

Referencia: [https://www.oracle.com/java/](https://www.oracle.com/java/)

---

# Edición, compilación y ejecución
![Compilación](imagenes/compilacion.jpeg)

---

# Edición, compilación y ejecución

En Linux, el flujo base por consola es:
- editar,
- compilar,
- ejecutar.

Es clave dominar esto antes de usar IDE.

---

# Edición, compilación y ejecución
## Actividad

1. Crear archivo fuente `.java`
```bash
nano FirstSample.java
```

Pegar este código:
```java
public class FirstSample {
    public static void main(String[] args) {
        System.out.println("¡Hola, Java!");
    }
}
```

Guardar y salir: `CTRL + X`, luego `Y`, luego `Enter`.

---

# Edición, compilación y ejecución

2. Compilar el archivo fuente:
```bash
javac FirstSample.java
```

Esto genera `FirstSample.class` (bytecode).

---

# Edición, compilación y ejecución

3. Ejecutar el programa:
```bash
java FirstSample
```

Salida esperada:
```text
¡Hola, Java!
```

---

# Trabajando con Java
## Definición e instalación de Java

- Descargar JDK desde Oracle:
  [https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- En Debian/Ubuntu puedes instalar OpenJDK por consola:
```bash
sudo apt install openjdk-21-jdk
```
- Verificar versión:
```bash
java --version
```

---

# Trabajando con Java
## Editor de texto

Para programas simples, puedes usar un editor liviano (por ejemplo, Sublime).

Objetivo mínimo del editor:
- buena indentación,
- resaltado de sintaxis,
- edición cómoda.

Evitar editores muy básicos como Notepad.

---

# Trabajando con Java

Un buen IDE acelera trabajo y reduce errores de formato.
IDEs recomendados:
- [Visual Studio Code](https://code.visualstudio.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/)
- [jGrasp](https://www.jgrasp.org/)
- [Eclipse](https://eclipseide.org/)
- [NetBeans](https://netbeans.apache.org/front/main/index.html)

---

# Configuración recomendada: IntelliJ + JDK 21 + Linux

Configuración sugerida para la asignatura:
- **Sistema operativo:** Linux
- **JDK:** 21 (LTS)
- **IDE:** IntelliJ IDEA o VSCode

También se puede trabajar con otros IDEs, pero esta combinación es la referencia del curso.

---

# Componentes de Java

Java incluye varias herramientas.

Algunas que usaremos:
- `java` (ejecución),
- `javac` (compilación),
- `javadoc` (documentación),
- JavaFX (interfaces gráficas).

Referencias:
- [Documentación JDK 21](https://docs.oracle.com/en/java/javase/21/)
- [Índice de componentes JDK 8](http://manuales.elo.utfsm.cl/manuales/jdk-8u40/index.html)

