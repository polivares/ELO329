public class AuthenticationService {
    public static class InvalidCredentialsException extends Exception {
        public InvalidCredentialsException(String msg) {
            super(msg);
        }
    }

    private int attempts = 0;
    private boolean locked = false;
    private Sensor sensor;

    public AuthenticationService(Sensor sensor) {
        this.sensor = sensor;
    }

    public void authenticate(String password) throws InvalidCredentialsException, AppLockedException {
        if (locked) {
            throw new AppLockedException("Estado de alerta activado, todas las funciones se han bloqueado por seguridad, no insistas Plankton, Arenita está en camino!!!!");
        }
        if (password.equals("CalamarinhoElegante")) {
            attempts = 0;
        } else {
            attempts++;
            if (attempts >= 3) {
                locked = true;
                sensor.detect();
                throw new AppLockedException("Estado de alerta activado, todas las funciones se han bloqueado por seguridad, no insistas Plankton, Arenita está en camino!!!!");
            } else {
                throw new InvalidCredentialsException("Usuario o clave inválidos. Intento " + attempts);
            }
        }
    }

    public void unlock(String code) {
        if (code.equals("1KRABBY$P4TTY")) {
            locked = false;
            attempts = 0;
            System.out.println("Alerta desactivada. Don Cangrejo ha ingresado el código.");
        } else {
            System.out.println("Código incorrecto.");
        }
    }

    public boolean isLocked() {
        return locked;
    }
}
