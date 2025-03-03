package residents;

//this is a abstract class for the middle earth characters
public abstract class MiddleEarthCharacter {

private String characterName;
private double healthStat;
private double powerLvl;

//CONSTRUCTORS
public MiddleEarthCharacter() {
	System.out.println("character created");
}

public MiddleEarthCharacter(String name, double health, double power) {
	this.characterName = name;
	this.healthStat = health;
	this.powerLvl = power;
}

//ABSTRACT METHODS
abstract boolean attack(MiddleEarthCharacter target);
abstract String getRace();

//GETTERS AND SETTERS
public String getCharacterName() {
	return characterName;
}

public void setCharacterName(String characterName) {
	this.characterName = characterName;
}

public double getHealthStat() {
	return healthStat;
}

public void setHealthStat(double healthStat) {
	this.healthStat = healthStat;
}

public double getPowerLvl() {
	return powerLvl;
}

public void setPowerLvl(double powerLvl) {
	this.powerLvl = powerLvl;
}

//METHODS
void displayInfo() {
 
}
}
