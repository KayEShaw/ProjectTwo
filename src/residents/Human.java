package residents;

public class Human extends MiddleEarthCharacter{

	//CONSTRUCTOR
	public Human(String name, double health, double power) {
		super(name, health, power);
		System.out.println("Human character created ("+ name +")");
	}
	@Override
	String getRace() {
		return "Human";
	}
	@Override
	boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Wizard")) {
			target.setHealthStat((target.getHealthStat()) - (1.5 * this.getPowerLvl()));
			System.out.println("attacked Wizard with 1.5x damage");
			return true;
		}
		else if(target.getRace().equals("Elf")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("attacked Elf");
			return true;
		}
		else if(target.getRace().equals("Dwarf")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("attacked Dwarf");
			return true;
		}
		else {
			System.out.println("no damage done");
		}
		return false;
	}
}
