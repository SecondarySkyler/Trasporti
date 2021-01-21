package trasporti;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Viaggio {
    private LocalDate dataPartenza;
    private LocalDate dataArrivo;
    private Percorso percorso;
    private Autocarro autocarro;
    private Merce merce;

    /**
     * Costruttore per la nostra istanza di Viaggio
     * @param p rappresenta la partenza
     * @param d rappresenta la destinazione
     */
    public Viaggio(String p, String d) {
        this.percorso = new Percorso(p,d);
    }

    /**
     * Permette di impostare la data di partenza
     * @param data la data di partenza,
     * @return this
     */
    public Viaggio setDataPartenza(String data) {
        this.dataPartenza = LocalDate.parse(data);
        return this;
    }

    /**
     * Permette di impostare la data di partenza
     * @param data la data di arrivo,
     * @return this
     */
    public Viaggio setDataArrivo(String data) {
        this.dataArrivo = LocalDate.parse(data);
        return this;
    }

    /**
     * Permette di specificare l'autocarro che effettuera' il viaggio
     * @param id il riferimento dell'autocarro (targa per esempio)
     * @param t il tipo di merce che puo' trasportare
     * @return this
     */
    public Viaggio setAutocarro(String id, TipoDiMerce t) {
        if (this.merce != null) {
            if (this.merce.getTipoMerce() != t) {
                throw new IllegalStateException("Il tipo di merce deve essere compatibile!");
            }
        }
        this.autocarro = new Autocarro(id, t);
        return this;
    }

    /**
     * Permette di definire la merce che dovra' essere trasportata
     * @param q la quantita' di merce da trasportare
     * @param t il tipo di merce
     * @return this
     */
    public Viaggio definisciMerce(Integer q, TipoDiMerce t) {
        if (this.autocarro != null) {
            if (this.autocarro.getTipoMerce() != t) {
                throw new IllegalStateException("Il tipo di merce deve essere compatibile!");
            }
        }
        this.merce = new Merce(q, t);
        return this;
    }

    /** Ritorna l'id dell'autocarro */
    public String getIdAutocarro() {
        return autocarro.getId();
    }

    public void setPercorso(Percorso percorso) {
        this.percorso = percorso;
    }
}
