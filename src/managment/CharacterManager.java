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
				
				for(int i = 0; i < characters.length; i++) {
					newCharacters[i] = characters[i]; //copy old elements 
				}
				
				this.characters = newCharacters;
				this.characters[characters.length/2] = c; //add it at the first open space 
			}
		}
		return true;
	}
	
	
}
