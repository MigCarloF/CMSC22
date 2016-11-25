package lab;
import lab.characters.*;
import lab.characters.Character;
import lab.weapons.*;
public class BehaviorTests {
	public static void main(String args[]){
		Character king = new King();
		Character queen = new Queen();
		Character knight = new Knight();
		Character troll = new Troll();
		
		king.setWeapon(new Knife());
		queen.setWeapon(new Sword());
		troll.setWeapon(new Axe());
		knight.setWeapon(new Bow());
		
		king.fight();
		queen.fight();
		troll.fight();
		knight.fight();
		king.setWeapon(new Axe());
		king.fight();
	}
}
