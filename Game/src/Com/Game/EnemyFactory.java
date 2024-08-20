package Com.Game;

public class EnemyFactory {
	public static Enemy createEnemy(String difficulty) {
        switch (difficulty) {
            case "Easy":
                return new EasyEnemy();
            case "Hard":
                return new HardEnemy();
            default:
                throw new IllegalArgumentException("Unknown difficulty: " + difficulty);
        }
    }
}
