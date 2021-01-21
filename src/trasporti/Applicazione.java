package trasporti;

import java.util.Map;

/**
 * Classe principale che permette la gestione di:
 * - prenotazioni
 *      -crea prenotazione
 *      -aggiunge prenotazione alle prenotazioni gia' presenti
 *      - permette di cercare le prenotazioni attive specificando diversi parametri
 *      - permette di reinstradare un viaggio su un altro percorso
 * -creazione di viaggi, con oggetti annessi (autocarro, percorso, date, merce)
 * -percorso
 *      -permette la creazione di un determinato percorso (sequenza di citta', 2 o piu', che l'autocarro dovra' passare)
 *      -aggiungere il percorso all'elenco dei percorsi
 *
 *
 */

public class Applicazione {
    private GestorePrenotazioni gestorePrenotazione;
    private GestorePercorsi gestorePercorsi;
//    private GestoreAutocarri gestoreAutocarri;

    /** Costruttore */
    public Applicazione() {
        this.gestorePrenotazione = new GestorePrenotazioni();
        this.gestorePercorsi = new GestorePercorsi();
    }

    /**
     * Permette la creazione di un viaggio
     * @param p nome della citta' di partenza
     * @param d nome della citta' di destinazione
     * @return un'istanza di Viaggio
     */
    public Viaggio creaViaggio(String p, String d) {
        Viaggio nuovoViaggio = new Viaggio(p, d);
        return nuovoViaggio;
    }

    /**
     * permette le creazione di una prenotazione
     * @param v il viaggio (con tutti i dettagli annessi) che dovra' essere gestito
     * @param riferimentoCliente il riferimento del cliente che ha effettuato la richiesta
     * @return un'istanza di Prenotazione
     */
    public Prenotazione creaPrenotazione(Viaggio v, Integer riferimentoCliente) {
        return new Prenotazione(v, riferimentoCliente);
    }

    /**
     * permette la creazione di un percorso, composto da una partenza e da una destinazione
     * @param p la citta' di partenza
     * @param d la citta' di destinazione
     * @return un'istanza di Percorso
     */
    public Percorso creaPercorso(String p, String d) {
        return new Percorso(p, d);
    }

    /** Aggiunge p al gestore delle prenotazioni */
    public void aggiungiPrenotazione(Prenotazione p) {
        gestorePrenotazione.aggiungiPrenotazione(p);
    }

    /** Aggiunge p al gestore dei percorsi */
    public void aggiungiPercorso(Percorso p) { gestorePercorsi.aggiungiPercorso(p);}

    /**
     * permette la ricerca di una prenotazione fornito l'id di un autocatto
     * @param idAutocarro il riferimento all'autocarro
     * @return una prenotazione se esiste, altrimenti solleva ecceziona
     * !!! eccezione da sollevare
     */
    public Map<Integer, Prenotazione> cercaPrenotazione(String idAutocarro) {
        return gestorePrenotazione.cercaPrenotazione(idAutocarro);
    }

    /**
     *  permette di cambiare reinstradare un viaggio su un differente percorso
     * @param v il viaggio che si vuole reinstradare
     * @param p il nuovo percorso da seguire
     */
    public void reinstradaViaggio(Viaggio v, Percorso p) {
        gestorePrenotazione.reinstradaViaggio(v, p);
    }


    public String elencoPercorsi() {
        return gestorePercorsi.toString();
    }

}
