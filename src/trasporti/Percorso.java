package trasporti;

import java.util.ArrayList;
import java.util.List;

/**
 * Rappresenta un generico percorso composto da almeno una partenza e una destinazione
 */

public class Percorso {

    private List<String> percorso;

    /** Costruttore */
    public Percorso(String p, String d) {
        this.percorso = new ArrayList<String>();
        percorso.add(p);
        percorso.add(d);
    }

    @Override
    public String toString() {
        return "Percorso{" +
                "percorso=" + percorso +
                '}';
    }
}
