public class Game {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        gameState.setLevel(1);
        gameState.setDifficulty("Medium");

        System.out.println("Game Level: " + gameState.getLevel());
        System.out.println("Game Difficulty: " + gameState.getDifficulty());

        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy enemy1 = enemyFactory.createEnemy("Goblin");
        Enemy enemy2 = enemyFactory.createEnemy("Orc");

        enemy1.attack();
        enemy2.attack();

        GameItemFactory medievalFactory = new MedievalGameItemFactory();
        Weapon sword = medievalFactory.createWeapon();
        PowerUp healthPotion = medievalFactory.createPowerUp();

        sword.use();
        healthPotion.activate();

        GameItemFactory fantasyFactory = new FantasyGameItemFactory();
        Weapon bow = fantasyFactory.createWeapon();
        PowerUp speedBoost = fantasyFactory.createPowerUp();

        bow.use();
        speedBoost.activate();
    }
}
