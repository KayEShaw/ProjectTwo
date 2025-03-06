package managment;

import residents.MiddleEarthCharacter;
import game.Mediator;

public class CharacterManager implements Mediator{
	MiddleEarthCharacter[] characters;
	int size;
	
	/**
	 * This is a default constructor to initialize the fields above 
	 */
	public CharacterManager() {
		this.characters = new MiddleEarthCharacter[5];
		this.size = 0;
	}
	
	/**
	 * This method checks if the array has space, if it does it adds in the character
	 * else if there is no more space it  creates a newSize variable that doubles the characters 
	 * length. Then it creates a new array using the newSize, uses a for loop to copy the old 
	 * components into the new one and then adds the character.
	 * @param c; the character we need to add
	 * @return; returns true if character is added successfully 
	 */
	public boolean addCharacter(MiddleEarthCharacter c) {
		if(characters.length == 20) {
			System.out.println("JESUS CHRIST ARE YOU BUILDING THE WHOLE VILLAGE");
		}
		if(characters[characters.length - 1] == null) {
		for(int i = 0; i < characters.length; i++) {
			if(characters[i] == null) {
				characters[i] = c;
				size++;
				System.out.println("added your character to array at position" + i);
				return true;
			}
		}
		}else{
				int newSize = characters.length * 2; //double current size 
				MiddleEarthCharacter[] newCharacters = new MiddleEarthCharacter[newSize]; // makes new array
				
				for(int j = 0; j < characters.length; j++) {
					newCharacters[j] = characters[j]; //copy old elements 
				}
				
				this.characters = newCharacters;
				characters[characters.length/2] = c; //add it at the first open space 
				size++;
				System.out.println("added at new array position "+ (characters.length / 2));
				return true;
			}
		return false;
		}
	
	/**
	 * This method goes through the characters added in the array
	 * and finds the characters that match the name 
	 * @param name; the name of the character to find 
	 * @return; returns character at certain index given the name 
	 */
	public MiddleEarthCharacter getCharacter(String name) {
		for(int i = 0; i < size; i++) {
			if(characters[i] != null && characters[i].getCharacterName().equals(name)) {
				return characters[i];
			}
		}
		return null;
	} 
	
	
	/**
	 * This method updates the information (name, health, power) of an existing character in the array 
	 *  
	 * @param character; type of character
	 * @param name; name of character
	 * @param health; health of character
	 * @param power; power of character
	 * @return; true if update is made, false if not changes are made or character is not found
	 */
	@Override
	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power) {
		for(int i = 0; i < size; i++) {
			if(characters[i] != null && characters[i].getCharacterName().equals(character.getCharacterName())) {
				
				//check if name needs to be updated
				if(!characters[i].getCharacterName().equals(name)) {
					characters[i].setCharacterName(name); //update the name
					return true;
				}
				
				if(characters[i].getHealthStat() != health) {
					characters[i].setHealthStat(health); //update health
					return true;
				}
				
				if(characters[i].getPowerLvl() != power) {
					characters[i].setPowerLvl(power);
					return true; 
				}
			}
		}
		return false; 
	} 
	
	/**
	 * This method checks if a character is in the array, and shifts all elements 
	 * on the right hand side to the left side one. Set the last index to null for 
	 * not duplicates.Reduce the size.
	 * @param character
	 * @return; return true if character is removed and size is decrement otherwise its false
	 */
	@Override
	public boolean deleteCharacter(MiddleEarthCharacter character) {
		for(int i = 0; i < size; i++) {
			if(characters[i] != null && characters[i].equals(character)) {
				System.out.println("match found");
				for(int j = i; j < size - 1; j++) {
					characters[j] = characters[j+1];
				}
				characters[size-1] = null; //set last element to null
				size--; //reduce size 
				System.out.println("character" + i + " deleted");
				return true; 
			}
		}
		System.out.println("character not deleted, no match found");
		return false;
	}
	
	
	/**
	 * This method displays all the characters in the array using displayInfo()
	 */
	public void displayAllCharacters() {
		for(int i = 0; i < size; i++) {
			if(characters[i] != null) {
				characters[i].displayInfo();
				//add display info 
			}
		}
	}

	
	/**
	 * This method goes through all the characters in the characters array and simulates a battle
	 * against other characters. If a characters health reaches zero after an attack it displays which
	 * character has died and deletes them from the array. It also prints out which character is currently
	 * doing the attacking and which one is getting attacked.
	 *  
	 */
	@Override
	public void executeAll() {
		for(int i = 0; i < (size); i++){
			for(int j = 0; j < (size); j++) {
				MiddleEarthCharacter current = characters[i];
				MiddleEarthCharacter target = characters[j];
				
				System.out.println(current.getCharacterName() + " is attacking " + target.getCharacterName());
				current.attack(target);
				if(target.getHealthStat() <= 0) {
					System.out.println(target.getCharacterName()+" died!!!");
					deleteCharacter(target);
				}
			}
		}
	}
	
	@Override
	public void exit() {
//implemented in MiddleEarthApp		
	}
}
