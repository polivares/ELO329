public class Auto{
    private Ruedas ruedas;

    Auto(int i){
        ruedas = new Ruedas(i);
        arrancar_auto();
    }

    void arrancar_auto(){
        class Motor{            // clase anónima declarada e instanciada dentro de un método
            void arranque(){
                encendido = true;
                System.out.println("brrrrommmm");
            }
        };
        Motor motor = new Motor();
        motor.arranque();
    }

    void detener_auto(){
        class Motor{            // clase anónima declarada e instanciada dentro de un método
            void arranque(){
                encendido = false;
                System.out.println("brrrrommmm");
            }
        };

    }
    class Ruedas{              // clase interna 
        Ruedas(int i){
            for(int o=0;o<i;o++)
                System.out.println("Hola, soy la rueda " + o);
        }
    }

    public static void main(String[] args) {
        Auto autito = new Auto(4);
        
    }
    

    boolean encendido;
}