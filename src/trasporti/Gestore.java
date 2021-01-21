package trasporti;

/**
 * rappresenta un'entita' che effettua delle operazioni su un insieme di elemeni
 * @param <T> tipo di oggetto che viene gestito
 */
public interface Gestore<T> {

    /**
     * Aggiunge un nuovo elemento al gestore
     * @param nuovo il nuovo elemento da aggiungere
     */
    void aggiungi(T nuovo);

    /**
     * Rimuove un elemento dall'insieme
     * @param daRimuovere l'elemento da rimuovere
     */
    void rimuovi(T daRimuovere);

}
