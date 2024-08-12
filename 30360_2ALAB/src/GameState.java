public class GameState {
    private static GameState single_instance = null;
    private int level;
    private String difficulty;

    private GameState() {
        level = 1;
        difficulty = "Easy";
    }

    public static GameState getInstance() {
        if (single_instance == null) {
            single_instance = new GameState();
        }
        return single_instance;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
