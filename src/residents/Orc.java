package residents;

public class Orc extends MiddleEarthCharacter{

	//CONSTRUCTOR
	public Orc(String name, double health, double power) {
		super(name, health, power);
		System.out.println("Orc character created ("+ name +")");
	}
	@Override
	String getRace() {
		return "Orc";
	}
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Human")) {
			target.setHealthStat((target.getHealthStat()) - (1.5 * this.getPowerLvl()));
			System.out.println("Orc attacked Human with 1.5x damage");
			return true;
		}
		else if(target.getRace().equals("Dwarf")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("Orc attacked Dwarf");
			return true;
		}
		else if(target.getRace().equals("Wizard")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("Orc attacked Wizard");
			return true;
		}
		else {
			System.out.println("Orc attacked "+ target.getRace()+"no damage done");
		}
		return false;
	}
}
