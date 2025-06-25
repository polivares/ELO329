# Nombre del ejecutable
TARGET = ayudantia8

# Compilador y flags
CXX = g++
CXXFLAGS = -Wall -std=c++17

# Archivos fuente
SRCS = main.cpp Movimiento.cpp Pokemon.cpp Tipo.cpp

# Archivos objeto (reemplaza .cpp por .o)
OBJS = $(SRCS:.cpp=.o)

# Regla por defecto
all: $(TARGET)

# Regla para compilar el ejecutable
$(TARGET): $(OBJS)
	$(CXX) $(CXXFLAGS) -o $(TARGET) $(OBJS)

# Regla para compilar archivos fuente en objetos
%.o: %.cpp
	$(CXX) $(CXXFLAGS) -c $< -o $@

# Regla para ejecutar el programa (depende de la compilación)
run: $(TARGET)
	./$(TARGET)

# Limpiar archivos objeto y el ejecutable
clean:
	rm -f $(OBJS) $(TARGET)
