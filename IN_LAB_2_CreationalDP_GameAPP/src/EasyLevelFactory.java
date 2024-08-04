public class EasyLevelFactory extends AbstractFactory {
    @Override
    public Weapon createWeapon() {

        return new Sword();
    }

    @Override
    public PowerUp createPowerUp() {

        return new HealthPack();
    }
}
