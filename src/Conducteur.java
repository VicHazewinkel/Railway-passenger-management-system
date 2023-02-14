public class Conducteur extends Persoon{
    private int ervaring;

    public Conducteur(String naam, int leeftijd, int ervaring) {
        super(naam, leeftijd);
        this.ervaring = ervaring;
    }

    public int getErvaring() {
        return ervaring;
    }

    public void setErvaring(int ervaring) {
        this.ervaring = ervaring;
    }

    @Override
    public String toString() {
        return "Conducteur " + getNaam() + " heeft al leeftijd " + getLeeftijd() + " jaar oud en heeft " + ervaring + " jaar ervaring";
    }
}
