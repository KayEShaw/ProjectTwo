package game;

import java.util.Scanner;
import managment.CharacterManager;
import residents.MiddleEarthCharacter;
import residents.Elf;
import residents.Dwarf;
import residents.Human;
import residents.Orc;
import residents.Wizard;

/**
 * seperate class for the "Menu". Considered to be good practice.
 * to prove the social experiment
 */
public class MenuProgram {
	
	private static CharacterManager characterManager;
	/**
	 * constructor for Menu program
	 * @param characterManager
	 */
	public MenuProgram(CharacterManager characterManager) {
		this.characterManager = characterManager;
	}

	/**
	 * this is a menu method to print the options for the user. 
	 * it is connected to the switch-case in MiddleEarthApp
	 */
	public static void Menu() {//options for the user to choose from
		System.out.println("\n-----Middle Earth Game-----");
		System.out.println("1. Create and add a character");
		System.out.println("2. Display existing charcters");
		System.out.println("3. Update your character");
		System.out.println("4. Delete a character");
		System.out.println("5. Execute all of your chracters attacks");
		System.out.println("6. Exit the game");
		System.out.println("Choose an option: ");			
	}
	/**
	 * this is a MenuProgram method to update the character
	 * this is implemented in the MiddleEarthApp switch-case
	 * takes in scanner input from the user
	 * @param scanner
	 */
	public void updateCharacter(Scanner scanner) {
		System.out.println("Enter the characters name to update: ");
		String name = scanner.nextLine();
		
		MiddleEarthCharacter changingCharacter = characterManager.getCharacter(name);
		if(changingCharacter != null) {
			System.out.println("Enter the new name, currently: "+changingCharacter.getCharacterName());
			String newName = scanner.nextLine();
			System.out.println("Enter the new health, currently: "+changingCharacter.getHealthStat());
			int newHealth = scanner.nextInt();
			System.out.println("Enter the new power lvl, currently: "+changingCharacter.getPowerLvl());
			int newPower = scanner.nextInt();
			scanner.nextLine();
			
			boolean status;
			status = characterManager.updateCharacter(changingCharacter, newName, newHealth, newPower);
			if(status) {
				System.out.println("Character updated");
			}else {
				System.out.println("Character not updated");
			}
		}else {
			System.out.println("Character not found");
		}
	}
	/**
	 * this is a MenuProgram method to delete a character 
	 * implements charactermanager.deleteCharacter
	 * used in MiddleEarthApp switch-case
	 * @param scanner
	 */
	public void deleteCharacter(Scanner scanner) {
		System.out.println("Enter the characters name to delete: ");
		String name = scanner.nextLine();
			MiddleEarthCharacter deleting = characterManager.getCharacter(name);
		if(deleting != null) {
			boolean status;
			status = characterManager.deleteCharacter(deleting);
			if(status) {
				System.out.println("deleted character");
			}else {
				System.out.println("not deleted");
			}
		}else {
			System.out.println("Character not found");
		}	
	}
	/**
	 * this is a method to create a character
	 * it is implemented in the MiddleEarthApp switch-case
	 * @param scanner
	 */
	public static void createCharacter(Scanner scanner) {
	
		System.out.println("\nChoose the type for your character:");
		System.out.println("1. Elf");
		System.out.println("2. Dwarf");
		System.out.println("3. Human");
		System.out.println("4. Orc");
		System.out.println("5. Wizard");
		System.out.println("Enter the number for the type you want: ");
		int characterType = scanner.nextInt();
		scanner.nextLine(); //for the enter
		
		System.out.println("Whats your characters name: ");
		String name = scanner.nextLine();
		System.out.println("Whats your characters health lvl: ");
		double health = scanner.nextDouble();
		System.out.println("Whats your characters power lvl: ");
		double power = scanner.nextDouble();
		scanner.nextLine();//for the enter
		
		MiddleEarthCharacter usersCharacter = null;
		
		switch(characterType) {
		case 1:
			//Elf
			usersCharacter = new Elf(name, health, power);
			break;
		case 2:
			//Dwarf
			usersCharacter = new Dwarf(name, health, power);
			break;
		case 3:
			//Human
			usersCharacter = new Human(name, health, power);
			break;
		case 4:
			//Orc
			usersCharacter = new Orc(name, health, power);
			break;
		case 5:
			//Wizard
			usersCharacter = new Wizard(name, health, power);
			break;
		default:
			System.out.println("Invalid option! Please try again");
			return;
		}
		
		boolean status;
		status = characterManager.addCharacter(usersCharacter);
		if(status) {
			System.out.println("Character "+name+" created and added to your list");
		}else {
			System.out.println("Character not created");
		}
		
	}
	
}
