package game;

import managment.CharacterManager;
import residents.MiddleEarthCharacter;
import residents.MiddleEarthCouncil;
import residents.Elf;

public class MiddleEarthApp {

	public static void main(String[] args) {
		// t
		MiddleEarthCouncil version = MiddleEarthCouncil.getInstance();
		CharacterManager characterManager = version.getCharacterManager();
		
//		Mediator user3 = new CharacterManager();
//		Mediator user4 = new CharacterManager();
		
		MiddleEarthCharacter froto = new Elf("froto", 10, 2);
		MiddleEarthCharacter dobby = new Elf("dobby", 20, 5);
		
		characterManager.addCharacter(froto);
		characterManager.addCharacter(dobby);
		
		
	boolean status;
		status = characterManager.updateCharacter(froto, "better froto", 15, 3);
		if(status) {
			System.out.println("Character updated");
		}else {
			System.out.println("Character not updated");
		}
		
		characterManager.displayAllCharacters();
		
		characterManager.deleteCharacter(dobby);
		
		characterManager.displayAllCharacters();
		

	}

}
