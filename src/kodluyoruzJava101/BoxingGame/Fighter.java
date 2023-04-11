package kodluyoruzJava101.BoxingGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double start;

    Fighter(String name, int damage, int health, int weight, double dodge, double start) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.start = start;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " attacked " + foe.name);

        if (foe.dodge()) {
            System.out.println(foe.name + " dodge the punch.");
            return foe.health;
        }else {
            System.out.println(this.name + " punched " + foe.name);
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;

    }

    boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }

    boolean start() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.start;
    }
}
