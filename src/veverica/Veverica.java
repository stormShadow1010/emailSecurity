package veverica;

public class Veverica {

    private String ime;
    private String boja;
    private final Ruka levaRuka;
    private final Ruka desnaRuka;
    private String staDrzi;

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public Veverica(String ime, String boja) {
        this.setIme(ime);
        this.setBoja(boja);
        //uzimamo metode definassane unutar classe Ruka
        this.levaRuka = new Ruka();
        this.desnaRuka = new Ruka();
        this.staDrzi = "NISTA";
    }

    public String getIme() {
        return ime;

    }

    public String getBoja() {
        return boja;
    }

    public String getStaDrzi() {
        return staDrzi;
    }

    //definisemo dva nova metoda za setovanje stanja desne i leve ruke  
    public void savijDesnuRuku() {
        desnaRuka.savij();
        System.out.println(ime + ": je savila desnu ruku.");
    }

    public void savijLevuRuku() {
        levaRuka.savij();
        System.out.println(ime + ": je savila levu ruku.");

        if (levaRuka.jeIspruzena()) {
            System.out.println(ime + ":je ispustila " + staDrzi);
            staDrzi = "NISTA";
        }
    }

    public void ispruziLevuRuku() {
        levaRuka.ispruzi();
        System.out.println(ime + ": je ispruzila levu ruku.");

        if (desnaRuka.jeIspruzena()) {
            System.out.println(ime + ": je ispustila " + staDrzi);
            staDrzi = "NISTA";

        }
    }

    public void ispruziDesnuRuku() {
        desnaRuka.ispruzi();
        System.out.println(ime + ": je ispruzila desnu ruku.");
    }

    public void pridrzi(String sta) {
        if (levaRuka.jeSavijena() || desnaRuka.jeSavijena()) {
            staDrzi = sta;
            System.out.println(ime + ": pridrzava " + sta);
        } else {
            System.out.println(ime + ":ne moze da pridrzi" + sta);
        }

    }
}
