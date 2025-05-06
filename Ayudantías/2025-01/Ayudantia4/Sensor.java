import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<Runnable> listeners = new ArrayList<>();

    public void add(Runnable listener) {
        listeners.add(listener);
    }

    public void detect() {
        listeners.forEach(Runnable::run);
    }
}
