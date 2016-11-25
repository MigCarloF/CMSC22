package lab.characters;

import lab.weapons.Weapon;

public abstract class Character {
	Weapon weapon;
	public Character(){}
	
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}
	
	public Weapon getWeapon(){
		return weapon;
	}
	
	public void fight(){
		weapon.useWeapon();
	}
}
