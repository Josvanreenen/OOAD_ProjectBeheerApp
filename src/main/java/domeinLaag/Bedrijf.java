package domeinLaag;

public class Bedrijf {
    private String naam;
    private String conctactpersoon;
    private String telefoonnummer;

    @Override
    public String toString() {
        return "Bedrijf{" +
                "naam='" + naam + '\'' +
                ", conctactpersoon='" + conctactpersoon + '\'' +
                ", telefoonnummer='" + telefoonnummer + '\'' +
                '}';
    }
}
