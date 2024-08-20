package Com.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        GameState gameState = GameState.getInstance();
		        gameState.setDifficulty("Hard");

		        // Create enemies based on difficulty
		        Enemy enemy = EnemyFactory.createEnemy(gameState.getDifficulty());
		        enemy.attack();

		        // Create weapons and power-ups based on difficulty
		        GameFactory gameFactory;
		        if (gameState.getDifficulty().equals("Easy")) {
		            gameFactory = new EasyGameFactory();
		        } else {
		            gameFactory = new HardGameFactory();
		        }

		        Weapon weapon = gameFactory.createWeapon();
		        PowerUp powerUp = gameFactory.createPowerUp();

		        weapon.use();
		        powerUp.activate();
	}

}
