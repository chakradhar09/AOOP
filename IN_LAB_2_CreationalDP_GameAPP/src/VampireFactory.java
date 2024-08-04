public class VampireFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {

        return new Vampire();
    }
}