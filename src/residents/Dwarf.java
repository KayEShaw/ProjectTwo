package residents;

public class Dwarf extends MiddleEarthCharacter{

	//CONSTRUCTOR
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}
	
	@Override
	public String getRace() {
		return "Dwarf";
	}
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Elf")) {
			target.setHealthStat(target.getHealthStat() - (1.5 * this.getPowerLvl()));
			return true;
		}
		else if(target.getRace().equals("Human")) {
			target.setHealthStat(target.getHealthStat() - this.getPowerLvl());
			return true;
		}
		else if(target.getRace().equals("Orc")) {
			target.setHealthStat(target.getHealthStat() - this.getPowerLvl());
			return true;
		}
		return false;
	}

}
