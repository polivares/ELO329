
class Point{
    // Aquí dentro, al igual que en Java 
    // incluiremos tanto los métodos como atributos
    // de nuestra clase
    public:
        Point();
        // Todos los elementos bajo public son públicos
        void draw();
        void moveTo(int x, int y);
        void lineTo(int x, int y);
    
    private:
        // Bajo esta etiqueta se indican los elementos
        // privados de la clase
        int m_X;
        int m_Y;
};