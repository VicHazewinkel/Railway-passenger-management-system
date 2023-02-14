import java.util.ArrayList;

public class PassagiersTrein extends Passagier{
    private int maxCapaciteit;
    private int huidigeCapaciteit;
    private ArrayList<Passagier> passagierArrayList;

    public PassagiersTrein(String naam, int leeftijd, boolean ticket, int maxCapaciteit, int huidigeCapaciteit) {
        super(naam, leeftijd, ticket);
        this.maxCapaciteit = maxCapaciteit;
        this.huidigeCapaciteit = huidigeCapaciteit;
        this.passagierArrayList = new ArrayList<Passagier>();
    }


    public int getMaxCapaciteit() {
        return maxCapaciteit;
    }

    public void setMaxCapaciteit(int maxCapaciteit) {
        this.maxCapaciteit = maxCapaciteit;
    }

    public int getHuidigeCapaciteit() {
        return huidigeCapaciteit;
    }

    public void setHuidigeCapaciteit(int huidigeCapaciteit) {
        this.huidigeCapaciteit = huidigeCapaciteit;
    }

    public ArrayList<Passagier> getPassagierArrayList() {
        return passagierArrayList;
    }

    public void setPassagierArrayList(ArrayList<Passagier> passagierArrayList) {
        this.passagierArrayList = passagierArrayList;
    }

    private void stapOp (Passagier passagier){
        if (passagier.isTicket()==true){
            passagierArrayList.add(passagier);
            passagier.setTicket(false);
            System.out.println(getNaam() + "welkom");
            System.out.println("ticket word opgenomen");
        }
        else
        {
            System.out.println(getNaam() + " heeft geen ticket");
        }
    }
    private void stapAf(Passagier passagier){
        if (passagierArrayList.contains(passagier)){
            passagierArrayList.remove(passagier);
            System.out.println(getNaam() + " verlaat de trein");
            // throw PassagierNietGevondenExeption;
        }
        else
        {
            System.out.println(getNaam() + " was illegaal op de trein en had geen ticket!!");
        }
    }

    @Override
    public String toString() {
        return "PassagiersTrein{" + "maxCapaciteit=" + maxCapaciteit + ", huidigeCapaciteit=" + huidigeCapaciteit + ", passagierArrayList=" + passagierArrayList + '}';
    }
}
