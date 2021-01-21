package trasporti;

public class Autocarro {
    private String id;
    private TipoDiMerce tdm;

    public Autocarro(String i, TipoDiMerce t) {
        this.id = i;
        this.tdm = t;
    }

    public String getId() {
        return id;
    }

    public TipoDiMerce getTipoMerce() {
        return tdm;
    }
}
