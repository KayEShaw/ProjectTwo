package residents;

public class Human extends MiddleEarthCharacter{

	//CONSTRUCTOR
	/**
	 * This is a parameterized constructor that helps the Human class initialize 
	 * it's own parameters by referencing the superclass constructor using "super(name, health, power)"
	 * @param name; name of character
	 * @param health; health of character
	 * @param power; power of character
	 */
	public Human(String name, double health, double power) {
		super(name, health, power);
		System.out.println("Human character created ("+ name +")");
	}
	
	/**
	 * this is an override method for an abstract method in MiddleEarthCharacter
	 * this returns the type of the subclass Human
	 */
	@Override
	String getRace() {
		return "Human";
	}
	
	/**
	 * This method creates an attack by the Human class on different character type. It shows the 
	 * damage done to each different race.
	 *  
	 * Human does 1.5x it's power as damage to a Wizard
	 * Human does damage equal to it's power level to a Elf or Dwarf
	 * If the race is unknown, it does no damage
	 * 
	 * returns true if damage is done, false if not 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Wizard")) {
			target.setHealthStat((target.getHealthStat()) - (1.5 * this.getPowerLvl()));
			System.out.println("Human attacked Wizard with 1.5x damage");
			return true;
		}
		else if(target.getRace().equals("Elf")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("Human attacked Elf");
			return true;
		}
		else if(target.getRace().equals("Dwarf")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("Human attacked Dwarf");
			return true;
		}
		else {
			System.out.println("Human attacked "+ target.getRace()+" no damage done");
		}
		return false;
	}
}
