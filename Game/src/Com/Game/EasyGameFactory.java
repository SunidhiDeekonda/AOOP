package Com.Game;

public class EasyGameFactory implements GameFactory{

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
        return new EasyWeapon();

	}

	@Override
	public PowerUp createPowerUp() {
		// TODO Auto-generated method stub
        return new EasyPowerUp();

	}

}
