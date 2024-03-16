package domeinLaag;

public class Projectlid {
    private String naam;
    private String functie;

    @Override
    public String toString() {
        return "Projectlid{" +
                "naam='" + naam + '\'' +
                ", functie='" + functie + '\'' +
                '}';
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }
}
