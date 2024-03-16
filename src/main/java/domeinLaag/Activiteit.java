package domeinLaag;

public class Activiteit {
    private String naam;
    private int weekNr;
    private int aantalUren;
    private Projectlid uitvoerder;

    @Override
    public String toString() {
        return "Activiteit{" +
                "naam='" + naam + '\'' +
                ", weekNr=" + weekNr +
                ", aantalUren=" + aantalUren +
                ", uitvoerder=" + uitvoerder +
                '}';
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setWeekNr(int weekNr) {
        this.weekNr = weekNr;
    }

    public void setAantalUren(int aantalUren) {
        this.aantalUren = aantalUren;
    }

    public void setUitvoerder(Projectlid projectlid) {
        this.uitvoerder = projectlid;
    }
}
