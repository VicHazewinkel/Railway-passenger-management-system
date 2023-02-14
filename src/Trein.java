public class Trein {
    private String naam;
    private String conducteur;

    public Trein(String naam, String conducteur) {
        this.naam = naam;
        this.conducteur = conducteur;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getConducteur() {
        return conducteur;
    }

    public void setConducteur(String conducteur) {
        this.conducteur = conducteur;
    }

    @Override
    public String toString() {
        return "Trein" + "naam='" + naam + ", conducteur='" + conducteur;
    }
}
