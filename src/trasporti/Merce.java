package trasporti;

/**
 * Rappresenta una generica merce
 */

public class Merce {
    private Integer quantita;
    private TipoDiMerce tdm;

    /** Costruttore */
    public Merce(Integer q, TipoDiMerce t) {
        this.quantita = q;
        this.tdm = t;
    }

    /** Ritorna il tipo di merce per this */
    public TipoDiMerce getTipoMerce() {
        return tdm;
    }
}
