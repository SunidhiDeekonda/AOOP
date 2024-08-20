package Com.Game;

public class GameState {
	    private static GameState instance;
	    private int level;
	    private String difficulty;

	    private GameState() {
	        level = 1;
	        difficulty = "Easy";
	    }

	    public static GameState getInstance() {
	        if (instance == null) {
	            instance = new GameState();
	        }
	        return instance;
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
