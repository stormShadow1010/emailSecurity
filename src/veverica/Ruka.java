package veverica;

public class Ruka {

    //ruka ima dva moguca stanja, SAVIJENA i ISPRUZENA 
    public enum Stanje {
        SAVIJENA, ISPRUZENA
    };

    private Stanje stanje = Stanje.ISPRUZENA;

    /*promena stanja uz pomoc dve metode:
            -metode savij
            -metode ispruzi
     */
    public void savij() {
        stanje = Stanje.SAVIJENA;
    }

    public void ispruzi() {
        stanje = Stanje.ISPRUZENA;
    }

    public Stanje getStanje() {
        return stanje;
    }

    //provera stanja ruke
    //ako je savijena, vraca true a ako nije savijena vraca false
    public boolean jeSavijena() {
        return stanje == Stanje.SAVIJENA;
    }

    public boolean jeIspruzena() {
        return stanje == Stanje.ISPRUZENA;
    }
}
