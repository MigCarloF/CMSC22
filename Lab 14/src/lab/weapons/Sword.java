package lab.weapons;

import lab.behaviors.SwordBehavior;

public class Sword implements Weapon{
	SwordBehavior behavior = new SwordBehavior();
	public void useWeapon(){
		behavior.useWeapon();
	}
}
