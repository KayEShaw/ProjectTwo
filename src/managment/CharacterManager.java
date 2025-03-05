package managment;

import residents.MiddleEarthCharacter;

public class CharacterManager {
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
	 * @return
	 */
	boolean addCharacter(MiddleEarthCharacter c) {
		for(int i = 0; i < characters.length; i++) {
			if(characters[i] != null) {
				characters[i] = c;
				size++;
				return true;
			}
			else if(characters[i] == null) {
				int newSize = characters.length * 2; //double current size 
				MiddleEarthCharacter[] newCharacters = new MiddleEarthCharacter[newSize]; // makes new array
				
				for(int j = 0; j < characters.length; j++) {
					newCharacters[j] = characters[j]; //copy old elements 
				}
				
				this.characters = newCharacters;
				this.characters[characters.length/2] = c; //add it at the first open space 
			}
		}
		return true;
	}
	
	/**
	 * This method goes through the characters added in the array
	 * and finds the characters that match the name 
	 * @param name; the name of the character to find 
	 * @return; returns character at certain index given the name 
	 */
	MiddleEarthCharacter getCharacter(String name) {
		for(int i = 0; i < size; i++) {
			if(characters[i] != null && characters[i].getCharacterName().equals(name)) {
				return characters[i];
			}
		}
		return null;
	} 
	
	
	/**
	 * This method updates the information (name, health, power) of an existing character in the array, 
	 * if any update is made, it returns true. If no changes are made or if the character is not found 
	 * it returns false.
	 *  
	 * @param character
	 * @param name
	 * @param health
	 * @param power
	 * @return
	 */
	boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power) {
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
	 * @return; return true if character is removed and size is decremted otherwise its false
	 */
	boolean deleteCharacter(MiddleEarthCharacter character) {
		for(int i = 0; i < size; i++) {
			if(characters[i] != null && characters[i].equals(character)) {
				for(int j = 0; j < size - 1; i++) {
					characters[j] = characters[j+1];
				}
				characters[size-1] = null; //set last element to null
				size--; //reduce size 
				return true; 
			}
		}
		return false;
	}
	
	
	/**
	 * This method displays all the characters in the array 
	 */
	void displayAllCharacters() {
		for(int i = 0; i < size; i++) {
			if(characters[i] != null) {
				//add display info 
			}
		}
	}
}
