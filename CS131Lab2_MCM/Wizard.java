
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	
	public Wizard() {
		name = "";
		health = 0;
		key = 0;
		locked = false;
		
	}//end constructor
	
	
	public Wizard(String name, int health) {
		this.name = name;
		this.health = health;
		this.key = key;
		this.locked = locked;
	}//end preferred constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		if (!isLocked()) {
			if (power > 0) {
				this.health -= power;
				if (this.health < 0) {
					this.health = 0;
				}
				System.out.println("Current Health: "+ health);
			} else {
				System.out.println("Error");
			}
			
		} else {
			System.out.println("Wizard is protected. No damage is taken.");
		}
		
	}//end takeDamage
	
	public String getName() {
		return name;
	
	}//end getName
	
	public void setName(String name) {
	
	}//end setName
	
	public int getHealth() {
		return this.health;
	
	}//end getHealth
	
	public void setHealth(int health) {
		
	}//end setHealth
	
	public int getKey() {
		return key;
	}//end getKey

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString


	@Override
	public void setKey(int key) {
		if (key > 0 && this.key == 0) {
			this.key = key;
			System.out.println("Set");
		} else {
			System.out.println("Not Set");
		}
		
	}//end setKey


	@Override
	public void lock(int key) {
		if (key == this.key) {
			locked = true;
			System.out.println("Wizard is protected");
		} else {
			System.out.println("Wrong spell, Wizard not protected.");
		}
		
	}//end lock


	@Override
	public void unlock(int key) {
		if (key == this.key) {
			locked = false;
			System.out.println("Wizard is unprotected");
		} else {
			System.out.println("Wrong spell, Wizard is still protected");
		}
		
	}//end unlock


	@Override
	public boolean isLocked() {
		
		return locked;
	}//end isLocked
	
}//end class
