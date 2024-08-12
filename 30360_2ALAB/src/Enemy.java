abstract class Enemy {
    public abstract void attack();
}

class Goblin extends Enemy {
    @Override
    public void attack() {
        System.out.println("Goblin attacks!");
    }
}

class Orc extends Enemy {
    @Override
    public void attack() {
        System.out.println("Orc attacks!");
    }
}

class EnemyFactory {
    public Enemy createEnemy(String type) {
        if (type.equalsIgnoreCase("Goblin")) {
            return new Goblin();
        } else if (type.equalsIgnoreCase("Orc")) {
            return new Orc();
        } else {
            return null;
        }
    }
}
