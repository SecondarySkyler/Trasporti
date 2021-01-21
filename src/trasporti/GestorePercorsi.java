package trasporti;

import java.util.ArrayList;
import java.util.List;

/**
 * rappresenta un gestore di percorsi
 */

public class GestorePercorsi implements Gestore<Percorso>{

    private List<Percorso> gestorePercorsi;

    /** Costruttore */
    public GestorePercorsi() {
        this.gestorePercorsi = new ArrayList<>();
    }

    /** POST-CONDIZIONE : il percorso viene gestito dal gestore */
    @Override
    public void aggiungi(Percorso nuovo) {
        gestorePercorsi.add(nuovo);

    }

    /** POST-CONDIZIONE : il percorso non viene piu' gestito dal gestore */
    @Override
    public void rimuovi(Percorso daRimuovere) {

    }

    /**
     * Aggiunge un nuovo percorso al gestore
     * @param p il percorso che verra' aggiunto
     * POST-CONDIZIONE: il numero dei percorsi gestiti e' > 0
     */
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
