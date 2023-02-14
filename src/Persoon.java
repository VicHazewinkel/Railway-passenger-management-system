import java.util.TreeSet;

public class Persoon {
    private String naam;
    private int leeftijd;
    private TreeSet<Persoon> TreesetLijstPesoon;   // treeset want gestudturrede lijst

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        TreesetLijstPesoon = new TreeSet<>();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public TreeSet<Persoon> getTreesetLijstPesoon() {
        return TreesetLijstPesoon;
    }

    public void setTreesetLijstPesoon(TreeSet<Persoon> treesetLijstPesoon) {
        TreesetLijstPesoon = treesetLijstPesoon;
    }

    @Override
    public String toString() {
        return "Passagier " + naam + "leeftijd= " + leeftijd;
    }
}
