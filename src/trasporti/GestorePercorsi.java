package trasporti;

import java.util.ArrayList;
import java.util.List;

public class GestorePercorsi implements Gestore<Percorso>{

    private List<Percorso> gestorePercorsi;

    public GestorePercorsi() {
        this.gestorePercorsi = new ArrayList<>();
    }

    @Override
    public void aggiungi(Percorso nuovo) {
        gestorePercorsi.add(nuovo);

    }

    @Override
    public void rimuovi(Percorso daRimuovere) {

    }

    void aggiungiPercorso(Percorso p) {
        aggiungi(p);
    }

    @Override
    public String toString() {
        return "GestorePercorsi{" +
                "gestorePercorsi=" + gestorePercorsi +
                '}';
    }
}
