package kodluyoruzJava101.BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter rockyBalboa = new Fighter("Rocky Balboa",20,85,90,60,50);
        Fighter ivanDrago = new Fighter("Ivan Drago",20,85,95,40,50);

        Match belt = new Match(rockyBalboa,ivanDrago,85,100);
        belt.fight();


    }
}
