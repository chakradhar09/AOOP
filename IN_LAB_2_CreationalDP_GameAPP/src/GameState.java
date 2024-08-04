// GameState.java
public class GameState {

    private int currentLevel;
    private int score;
    private String difficulty;

    private GameState() {
        currentLevel = 1;
        score = 0;
        difficulty = "Easy";
    }

    private static final class InstanceHolder {
        private static final GameState instance = new GameState();
    }

    public static GameState getInstance() {
        return InstanceHolder.instance;
    }

    public int getCurrentLevel() {
        
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        
        this.currentLevel = currentLevel;
    }

    public int getScore() {
        
        return score;
    }

    public void setScore(int score) {
        
        this.score = score;
    }

    public String getDifficulty() {
        
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        
        this.difficulty = difficulty;
    }
}

