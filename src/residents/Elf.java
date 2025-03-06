package residents;

public class Elf extends MiddleEarthCharacter{
	
	/**
	 * This is a parameterized constructor that helps the Elf class initialize 
	 * it's own parameters by referencing the superclass constructor using "super(name, health, power)"
	 * @param name; name of character
	 * @param health; health of character
	 * @param power; power of character
	 */
	//CONSTRUCTOR
	public Elf(String name, double health, double power) {
		super(name, health, power);
		System.out.println("Elf character created ("+ name +")");
	}
	
	/**
	 * this is an override method for an abstract method in MiddleEarthCharacter
	 * this returns the type of the subclass Human
	 */
	@Override
	public String getRace() {
		return "Elf";
	}
	
	/**
	 * This method creates an attack by the Elf class on different character type. It shows the 
	 * damage done to each different race.
	 *  
	 * Elf does 1.5x it's power as damage to an Orc
	 * Elf does damage equal to it's power level to a Human or Wizard
	 * If the race is unknown, it does no damage
	 * 
	 * returns true if damage is done, false if not 
	 */
	@Override 
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Orc")) {
			target.setHealthStat((target.getHealthStat()) - (1.5 * this.getPowerLvl()));
			System.out.println("Elf attacked Orc with 1.5x damage");
			return true;
		}
		else if(target.getRace().equals("Human")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("Elf attacked Human");
			return true;
		}
		else if(target.getRace().equals("Wizard")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("Elf attacked Wizard");
			return true;
		}
		else {
			System.out.println("attacked "+target.getRace()+" no damage done");
		}
		return false;
	}

}
