public class HardLevelFactory extends AbstractFactory {
    @Override
    public Weapon createWeapon() {

        return new Gun();
    }

    @Override
    public PowerUp createPowerUp() {

        return new Shield();
    }
}