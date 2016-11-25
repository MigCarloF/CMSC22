package lab.weapons;

import lab.behaviors.KnifeBehavior;

public class Knife implements Weapon{
	KnifeBehavior behavior = new KnifeBehavior();
	public void useWeapon(){
		behavior.useWeapon();
	}
}
