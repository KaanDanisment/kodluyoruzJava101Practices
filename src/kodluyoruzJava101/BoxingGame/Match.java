package kodluyoruzJava101.BoxingGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void fight() {
        if (checkWeight()) {
            if (f1.start()) {
                while (true) {
                    System.out.println("---------NEW ROUND----------");
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    System.out.println(f1.health);
                    System.out.println(f2.health);
                }

            } else {
                while (true) {
                    System.out.println("---------NEW ROUND----------");
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    System.out.println(f1.name + " Health: " + f1.health);
                    System.out.println(f2.name + " Health: " + f2.health);
                }
            }

        } else {
            System.out.println("Fighters' weights do not match");
        }
    }

    boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("The winner is " + f2.name);
            return true;
        }
        if (f2.health == 0) {
            System.out.println("The winner is " + f1.name);
            return true;
        }
        return false;
    }
}
