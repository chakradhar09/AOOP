public class ZombieFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {

        return new Zombie();
    }
}