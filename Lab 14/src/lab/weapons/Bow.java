package lab.weapons;

import lab.behaviors.BowBehavior;

public class Bow implements Weapon {
	BowBehavior behavior = new BowBehavior();
	public void useWeapon(){
		behavior.useWeapon();
	}

}
