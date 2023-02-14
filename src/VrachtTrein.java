public class VrachtTrein extends Trein implements Aflaadbaar{
    private int maxLaadVermogen;
    private int geladen;

    public VrachtTrein(String naam, String conducteur, int maxLaadVermogen, int geladen) {
        super(naam, conducteur);
        this.maxLaadVermogen = maxLaadVermogen;
        this.geladen = geladen;
    }

    public int getMaxLaadVermogen() {
        return maxLaadVermogen;
    }

    public void setMaxLaadVermogen(int maxLaadVermogen) {
        this.maxLaadVermogen = maxLaadVermogen;
    }

    public int getGeladen() {
        return geladen;
    }

    public void setGeladen(int geladen) {
        this.geladen = geladen;
    }

    @Override
    public String toString() {
        return "VrachtTrein " + getNaam() + ", concucteur= " + getConducteur() + ", maxLaadVermogen=" + maxLaadVermogen + " Ton, geladen=" + geladen + " Ton";
    }

    @Override
    public void Aflaadbaar() {
        this.geladen = 0;
        System.out.println("Vracht word gelost");
    }
}
