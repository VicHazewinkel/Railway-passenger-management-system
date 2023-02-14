public class main {
    public static void main(String[] args) {
        Conducteur mijnConducteur1 = new Conducteur("Robin", 35, 5);
        System.out.println(mijnConducteur1);
        Conducteur mijnConducteur2 = new Conducteur("klaas", 37, 10);
        System.out.println(mijnConducteur2);

        Passagier passagier1 = new Passagier("Lode", 22, true);
        Passagier passagier2 = new Passagier("Ahmad", 23, true);
        Passagier passagier3 = new Passagier("Erica", 22, true);
        Passagier passagier4 = new Passagier("Josh", 25, false);
        Passagier passagier5 = new Passagier("Zoe", 24, false);
        Passagier passagier6 = new Passagier("Chantal", 21, true);

        VrachtTrein mijnVrachttrein = new VrachtTrein("Robin Express", "Robin", 50, 40);
        System.out.println(mijnVrachttrein);
        mijnVrachttrein.Aflaadbaar();
        System.out.println(mijnVrachttrein);

        PassagiersTrein mijnPassagiersTrein = new PassagiersTrein("Ehb Express", 10, true, 15, 0);

        passagier1.stapOp;
                // zou moeten geven
                //  System.out.println(getNaam() + "welkom");
                //  System.out.println("ticket word opgenomen");
        passagier2.stapOp;
        passagier3.stapOp;
        passagier4.stapOp;
        passagier5.stapOp;
        passagier6.stapOp;

        passagier4.stapAf;

        System.out.println(mijnPassagiersTrein);



    }
}
