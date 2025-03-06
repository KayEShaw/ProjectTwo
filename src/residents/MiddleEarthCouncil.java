package residents;

import managment.CharacterManager;

public class MiddleEarthCouncil {
	private static MiddleEarthCouncil instance;
	private CharacterManager characterManager; //create instance of CharacterManager 
	
	/**
	 * Private constructor so no one can create an instance of the class
	 */
	private MiddleEarthCouncil() {
		this.characterManager =  new CharacterManager(); //initialize when council is instance is made
	}

	/**
	 * This is a public method to get the instance 
	 * @return
	 */
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		} 
		return instance;
	}

	/**
	 * Method to provide access to the CharacterManager class
	 * @return
	 */
	public CharacterManager getCharacterManager() {
		return characterManager;
	}
}
