package residents;

public class Elf extends MiddleEarthCharacter{
	//CONSTRUCTOR
	public Elf(String name, double health, double power) {
		super(name, health, power);
		System.out.println("Elf character created ("+ name +")");
	}
	@Override
	public String getRace() {
		return "Elf";
	}
	@Override 
	boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Orc")) {
			target.setHealthStat((target.getHealthStat()) - (1.5 * this.getPowerLvl()));
			System.out.println("attacked Orc with 1.5x damage");
			return true;
		}
		else if(target.getRace().equals("Human")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("attacked Human");
			return true;
		}
		else if(target.getRace().equals("Wizard")) {
			target.setHealthStat((target.getHealthStat()) - (this.getPowerLvl()));
			System.out.println("attacked Wizard");
			return true;
		}
		else {
			System.out.println("no damage done");
		}
		return false;
	}

}
