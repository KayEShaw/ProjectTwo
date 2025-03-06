package residents;


public class Dwarf extends MiddleEarthCharacter{

	/**
	 * This is a parameterized constructor that helps the Dwarf class initialize 
	 * it's own parameters by referencing the superclass constructor using "super(name, health, power)"
	 * @param name; name of character
	 * @param health; health of character
	 * @param power; power of character
	 */
	//CONSTRUCTOR
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
		System.out.println("Dwarf character created ("+name+")");
	}
	
	/**
	 * This method returns the type of character
	 */
	@Override
	public String getRace() {
		return "Dwarf";
	}
	
	/**
	 * This method creates an attack by the Dwarf class on different character type. It shows the 
	 * damage done to each different race.
	 *  
	 * Dwarf does 1.5x it's power as damage to an Elf
	 * Dwarf does damage equal to it's power level to a Human or Orc
	 * If the race is unknown, it does no damage
	 * 
	 * returns true if damage is done, false if not 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Elf")) {
			target.setHealthStat(target.getHealthStat() - (1.5 * this.getPowerLvl()));
			System.out.println("Dwarf attacked Elf with 1.5 damage");
			return true;
		}
		else if(target.getRace().equals("Human")) {
			target.setHealthStat(target.getHealthStat() - this.getPowerLvl());
			System.out.println("Dwarf attacked Human");
			return true;
		}
		else if(target.getRace().equals("Orc")) {
			target.setHealthStat(target.getHealthStat() - this.getPowerLvl());
			System.out.println("Dwarf attacked Orc");
			return true;
		}
		else {
			System.out.println("Dwarf attacked "+ target.getRace() +"no damage done");
		}
		return false;
	}

}
