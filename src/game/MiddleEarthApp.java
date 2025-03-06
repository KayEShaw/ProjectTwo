package game;

import managment.CharacterManager;
import residents.MiddleEarthCharacter;
import residents.MiddleEarthCouncil;
import residents.Elf;
import residents.Dwarf;
import residents.Human;
import residents.Orc;
import residents.Wizard;


public class MiddleEarthApp {

	public static void main(String[] args) {
		// creating instance of MiddleEarthCouncil
		MiddleEarthCouncil version = MiddleEarthCouncil.getInstance();
		CharacterManager characterManager = version.getCharacterManager();
		
		//creating characters
		MiddleEarthCharacter froto = new Elf("froto", 100, 2);
		MiddleEarthCharacter angry = new Dwarf("mean", 100, 2);
		MiddleEarthCharacter sleepy = new Human("sad", 100, 2);
		MiddleEarthCharacter doapy = new Orc("stupid", 100, 2);
		MiddleEarthCharacter happy = new Wizard("smiles", 100, 2);

		//adding all characters
		boolean status = false;
		
		status = characterManager.addCharacter(froto);
		if(status) {
			System.out.println("added!");
		}else {
			System.out.println("not added");
		}
		status = characterManager.addCharacter(angry);
		if(status) {
			System.out.println("added!");
		}else {
			System.out.println("not added");
		}
		status = characterManager.addCharacter(sleepy);
		if(status) {
			System.out.println("added!");
		}else {
			System.out.println("not added");
		}
		status = characterManager.addCharacter(doapy);
		if(status) {
			System.out.println("added!");
		}else {
			System.out.println("not added");
		}
		status = characterManager.addCharacter(happy);
		if(status) {
			System.out.println("added!");
		}else {
			System.out.println("not added");
		}
		
		characterManager.displayAllCharacters();
		
		
		//updating characters
		status = characterManager.updateCharacter(froto, "better froto", 15, 3);
		if(status == true) {
			System.out.println("Character updated");
		}else {
			System.out.println("Character not updated");
		}		
		characterManager.displayAllCharacters();
		
		//attacking them all
		characterManager.executeAll();
		
		characterManager.displayAllCharacters();
		

	}

}
