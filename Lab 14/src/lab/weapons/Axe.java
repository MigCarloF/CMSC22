package lab.weapons;

import lab.behaviors.AxeBehavior;

public class Axe implements Weapon{
	AxeBehavior behavior = new AxeBehavior();
	public void useWeapon(){
		behavior.useWeapon();
	}
}
