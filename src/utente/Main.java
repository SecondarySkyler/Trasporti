package utente;

import trasporti.*;

public class Main {
    public static void main(String[] args) {
        Applicazione app = new Applicazione();

        Percorso percorso = app.creaPercorso("Udine", "Roma");
        app.aggiungiPercorso(percorso);

        System.out.println(app.elencoPercorsi());

        Viaggio v = app.creaViaggio("Milano", "Roma").setDataPartenza("2021-01-21").setDataArrivo("2021-01-23").setAutocarro("123", TipoDiMerce.GAS).definisciMerce(100, TipoDiMerce.GAS);

        Prenotazione p = app.creaPrenotazione(v, 1);

        app.aggiungiPrenotazione(p);

        app.reinstradaViaggio(v, percorso);

        System.out.println(app.cercaPrenotazione("123"));


    }




}
