package trasporti;

import java.util.ArrayList;
import java.util.List;

public class Percorso {

    private List<String> percorso;

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
