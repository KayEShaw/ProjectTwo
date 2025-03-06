package residents;


public class Dwarf extends MiddleEarthCharacter{

	
	//CONSTRUCTOR
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
		System.out.println("Dwarf character created ("+name+")");
	}

	@Override
	public String getRace() {
		return "Dwarf";
	}
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
