package trasporti;

import java.util.Map;

public class Applicazione {
    private GestorePrenotazioni gestorePrenotazione;
    private GestorePercorsi gestorePercorsi;
//    private GestoreAutocarri gestoreAutocarri;

    public Applicazione() {
        this.gestorePrenotazione = new GestorePrenotazioni();
        this.gestorePercorsi = new GestorePercorsi();
    }

    public Viaggio creaViaggio(String p, String d) {
        Viaggio nuovoViaggio = new Viaggio(p, d);
        return nuovoViaggio;
    }

    public Prenotazione creaPrenotazione(Viaggio v, Integer riferimentoCliente) {
        return new Prenotazione(v, riferimentoCliente);
    }

    public Percorso creaPercorso(String p, String d) {
        return new Percorso(p, d);
    }

    /** Aggiunge p al gestore delle prenotazioni */
    public void aggiungiPrenotazione(Prenotazione p) {
        gestorePrenotazione.aggiungiPrenotazione(p);
    }

    /** Aggiunge p al gestore dei percorsi */
    public void aggiungiPercorso(Percorso p) { gestorePercorsi.aggiungiPercorso(p);}

    public Map<Integer, Prenotazione> cercaPrenotazione(String idAutocarro) {
        return gestorePrenotazione.cercaPrenotazione(idAutocarro);
    }

    public void reinstradaViaggio(Viaggio v, Percorso p) {
        gestorePrenotazione.reinstradaViaggio(v, p);
    }

    public String elencoPercorsi() {
        return gestorePercorsi.toString();
    }

}
