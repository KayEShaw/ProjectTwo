package game;

import residents.MiddleEarthCharacter;

public interface Mediator {
	boolean addCharacter(MiddleEarthCharacter name);
	void displayAllCharacters();
	boolean updateCharacter(MiddleEarthCharacter c, String n, int health, int power);
	boolean deleteCharacter(MiddleEarthCharacter name);
	void executeAll();
	void exit();
}
