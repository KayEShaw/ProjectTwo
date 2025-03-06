package residents;

public class Wizard extends MiddleEarthCharacter{
	//CONSTRUCTOR
	public Wizard(String name, double health, double power) {
		super(name, health, power);
		System.out.println("Wizard character created ("+ name +")");
	}
	@Override
	String getRace() {
		return "Wizard";
	}
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Dwarf")) {
			target.setHealthStat((target.getHealthStat()) - (1.5 * this.getPowerLvl()));
			System.out.println("wizerd attacked Dwarf with 1.5x damage");
			return true;
		}
		else if(target.getRace().equals("Elf")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("wizard attacked Elf");
			return true;
		}
		else if(target.getRace().equals("Orc")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("wizard attacked Orc");
			return true;
		}
		else {
			System.out.println("wizard attacked "+ target.getRace()+ " no damage done");
		}
		return false;
	}

}
