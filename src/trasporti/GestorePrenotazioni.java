package trasporti;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorePrenotazioni implements Gestore<Prenotazione> {

    private Map<Integer, Prenotazione> prenotazioniAttive;

    public GestorePrenotazioni() {
        this.prenotazioniAttive = new HashMap<Integer, Prenotazione>();
    }

    @Override
    public void aggiungi(Prenotazione nuovo) {
        Integer rifCliente = nuovo.getRiferimentoCliente();
        prenotazioniAttive.put(rifCliente, nuovo);
    }

    @Override
    public void rimuovi(Prenotazione daRimuovere) {

    }

    public void aggiungiPrenotazione(Prenotazione p) {
        aggiungi(p);
    }

    public Map<Integer, Prenotazione> cercaPrenotazione(String idAutocarro) {
        Map<Integer, Prenotazione> prenotati = new HashMap<>();

        for (Prenotazione prenotazione : prenotazioniAttive.values()) {
            if (prenotazione.getIdAutocarro() == idAutocarro) {
                prenotati.put(prenotazione.getRiferimentoCliente(), prenotazione);
            }
        }
        return prenotati;
    }

    public void reinstradaViaggio(Viaggio v, Percorso p) {
        for (Prenotazione prenotazione : prenotazioniAttive.values()) {
            if (prenotazione.getViaggio().equals(v)) {
                prenotazione.getViaggio().setPercorso(p);
            }
        }
    }
}
