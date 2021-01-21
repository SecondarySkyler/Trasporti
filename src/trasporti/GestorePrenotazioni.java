package trasporti;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * rappresenta un gestore per le prenotazioni
 */

public class GestorePrenotazioni implements Gestore<Prenotazione> {

    private Map<Integer, Prenotazione> prenotazioniAttive;

    /** Costruttore */
    public GestorePrenotazioni() {
        this.prenotazioniAttive = new HashMap<Integer, Prenotazione>();
    }

    /**
     * Aggiunge una nuova prenotazione al gestore
     * @param nuovo il nuovo elemento da aggiungere
     */
    @Override
    public void aggiungi(Prenotazione nuovo) {
        Integer rifCliente = nuovo.getRiferimentoCliente();
        prenotazioniAttive.put(rifCliente, nuovo);
    }

    @Override
    public void rimuovi(Prenotazione daRimuovere) {

    }

    /**
     * Aggiunge la prenotazione p al gestore
     * @param p la prenotazione aggiunta
     */
    public void aggiungiPrenotazione(Prenotazione p) {
        aggiungi(p);
    }

    /**
     * Permette la ricerca di una prenotazione tramite specifica dell'id dell'autocarro
     * @param idAutocarro il riferimenti per cui cercare la prenotazione
     * @return una o piu' prenotazioni se esistono, altrimenti solleva eccezione
     * !!! eccezione da sollevare
     */
    public Map<Integer, Prenotazione> cercaPrenotazione(String idAutocarro) {
        Map<Integer, Prenotazione> prenotati = new HashMap<>();

        for (Prenotazione prenotazione : prenotazioniAttive.values()) {
            if (prenotazione.getIdAutocarro() == idAutocarro) {
                prenotati.put(prenotazione.getRiferimentoCliente(), prenotazione);
            }
        }
        return prenotati;
    }

    /**
     * Permette di reinstradare un viaggio su un percorso differente
     * @param v il viaggio da reinstradare
     * @param p il nuovo percorso da seguire
     */
    public void reinstradaViaggio(Viaggio v, Percorso p) {
        for (Prenotazione prenotazione : prenotazioniAttive.values()) {
            if (prenotazione.getViaggio().equals(v)) {
                prenotazione.getViaggio().setPercorso(p);
            }
        }
    }
}
