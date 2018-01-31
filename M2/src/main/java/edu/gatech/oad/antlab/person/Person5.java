package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Jessie
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	    char[] newName = new char[input.length()];
	  	for (int i = 2, j = 0; i < input.length() && j < input.length() - 2; i++, j++) {
	  		newName[i] = input.charAt(j);
		}
		for (int i = 2, j = newName.length; i > 0 && j > newName.length - 2; i--, j--) {
	  		newName[j] = input.charAt(i);
		}
		//Person 5 put your implementation here
	  return java.util.Arrays.toString(newName);
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
