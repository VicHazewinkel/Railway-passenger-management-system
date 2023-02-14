public class PassagierNietGevondenExeption extends Exception{
    void PassagierNietGevondenExeption(Passagier passagier) {
        System.out.println("was illegaal op de trein en had geen ticket!!");
    }
}
