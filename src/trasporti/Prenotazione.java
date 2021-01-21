package trasporti;

public class Prenotazione {

    private Viaggio viaggio;
    private Integer riferimentoCliente;

    public Prenotazione(Viaggio v, Integer rif) {
        this.viaggio = v;
        this.riferimentoCliente = rif;
    }

    public Integer getRiferimentoCliente() {
        return riferimentoCliente;
    }

    public Viaggio getViaggio() {
        return viaggio;
    }

    /** Ritorna l'id dell'autocarro */
    public String getIdAutocarro() {return viaggio.getIdAutocarro();}


}
