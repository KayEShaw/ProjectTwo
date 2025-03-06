package game;

import managment.CharacterManager;
import residents.MiddleEarthCharacter;
import residents.MiddleEarthCouncil;
import java.util.Scanner;


public class MiddleEarthApp {

	public static void main(String[] args) {
		// creating instance of MiddleEarthCouncil
		MiddleEarthCouncil version = MiddleEarthCouncil.getInstance();
		CharacterManager characterManager = version.getCharacterManager();
		
		//implementing menuProgram for a cleaner main class
		MenuProgram menuProgram = new MenuProgram(characterManager);
		Scanner scanner = new Scanner(System.in);//standard input stream
		
		boolean playing = true;
		
		while(playing) {
			MenuProgram.Menu();
			
			int answer = scanner.nextInt();
			scanner.nextLine();
		//switch - case for every option offered in the MenuProgram
		switch(answer) {
		case 1:
			//making and adding characters
			MenuProgram.createCharacter(scanner);
			break;
		case 2:
			//displaying characters
			characterManager.displayAllCharacters();
			break;
		case 3:
			//updating a character
			menuProgram.updateCharacter(scanner);
			break;
		case 4:
			//delete a character
			menuProgram.deleteCharacter(scanner);
			break;
		case 5:
			//Execute all attacks
			characterManager.executeAll();
			break;
		case 6:
			//exit the game
			System.out.println("Game over.");
			playing = false;
			break;
		default:
			System.out.println("Invalid option! Please try again");	
		}
	}
		scanner.close();
}

	}

