package trasporti;

public class Merce {
    private Integer quantita;
    private TipoDiMerce tdm;

    public Merce(Integer q, TipoDiMerce t) {
        this.quantita = q;
        this.tdm = t;
    }

    public TipoDiMerce getTipoMerce() {
        return tdm;
    }
}
