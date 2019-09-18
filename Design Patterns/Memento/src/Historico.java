import java.util.ArrayList;
import java.util.List;


/**
 * Design Pattern MEMENTO.
 * Serve com um meio de guardar informação, podendo ir atrás e buscar a informação que estava anteriormente setada.
 */
public class Historico {

    private List<Estado> estadosSalvos = new ArrayList<>();

    public Estado getEstado(int index) {
        return estadosSalvos.get(index);
    }

    public void add(Estado estado) {
        this.estadosSalvos.add(estado);
    }
}
