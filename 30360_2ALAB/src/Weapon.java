// Weapons
abstract class Weapon {
    public abstract void use();
}

class Sword extends Weapon {
    @Override
    public void use() {
        System.out.println("Swinging sword!");
    }
}

class Bow extends Weapon {
    @Override
    public void use() {
        System.out.println("Shooting arrow!");
    }
}

// Power-ups
abstract class PowerUp {
    public abstract void activate();
}

class HealthPotion extends PowerUp {
    @Override
    public void activate() {
        System.out.println("Health restored!");
    }
}

class SpeedBoost extends PowerUp {
    @Override
    public void activate() {
        System.out.println("Speed increased!");
    }
}

// Abstract Factory
interface GameItemFactory {
    Weapon createWeapon();
    PowerUp createPowerUp();
}

// Concrete Factories
class MedievalGameItemFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthPotion();
    }
}

class FantasyGameItemFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public PowerUp createPowerUp() {
        return new SpeedBoost();
    }
}
