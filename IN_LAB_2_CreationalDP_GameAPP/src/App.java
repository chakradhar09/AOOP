public class App 
    {
            public static void main(String[] args) 
        {
            GameState gameState = GameState.getInstance();
            gameState.setCurrentLevel(1);
            gameState.setDifficulty("Easy");
    
            EnemyFactory enemyFactory;
            if (gameState.getCurrentLevel() == 1) {
                enemyFactory = new ZombieFactory();
            } else {
                enemyFactory = new VampireFactory();
            }
            Enemy enemy = enemyFactory.createEnemy();
            enemy.attack();
    
            AbstractFactory levelFactory;
            if (gameState.getDifficulty().equals("Easy")) {
                levelFactory = new EasyLevelFactory();
            } else {
                levelFactory = new HardLevelFactory();
            }
            Weapon weapon = levelFactory.createWeapon();
            PowerUp powerUp = levelFactory.createPowerUp();
    
            weapon.use();
            powerUp.apply();
    
            gameState.setScore(100);
            gameState.setCurrentLevel(2);
            System.out.println("Game State: Level - " + gameState.getCurrentLevel() + ", Score - " + gameState.getScore());
        }
    
    
    }

