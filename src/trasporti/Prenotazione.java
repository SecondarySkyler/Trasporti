package trasporti;

/**
 * Rappresenta una generica prenotazione
 */

public class Prenotazione {

    private Viaggio viaggio;
    private Integer riferimentoCliente;

    /** Costruttore */
    public Prenotazione(Viaggio v, Integer rif) {
        this.viaggio = v;
        this.riferimentoCliente = rif;
    }

    /** torna il riferimento del cliente che ha richiesto il viaggio */
    public Integer getRiferimentoCliente() {
        return riferimentoCliente;
    }

    /** torna l'istanza di autocarro */
    public Viaggio getViaggio() {
        return viaggio;
    }

    /** Ritorna l'id dell'autocarro */
    public String getIdAutocarro() {return viaggio.getIdAutocarro();}


}
