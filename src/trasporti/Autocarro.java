package trasporti;

/**
 * rappresenta un generico autocarro
 */
public class Autocarro {
    private String id;
    private TipoDiMerce tdm;

    /** Costruttore */
    public Autocarro(String i, TipoDiMerce t) {
        this.id = i;
        this.tdm = t;
    }

    /** Ritorna l'identificativo dell'autocarro */
    public String getId() {
        return id;
    }

    /** Ritorna tipo di merce che l'autocarro puo' trasportare */
    public TipoDiMerce getTipoMerce() {
        return tdm;
    }
}
