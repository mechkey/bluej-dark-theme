import java.io.*;
import java.util.*;

public class Input {
	private String input;

	public Input() {
		input = "";
	}

	/**
	 * Generic get input method
	 * @return the inputted string.
	 */
	public static String getInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}
	
	/**
	 * Get input method specifically for the light/dark switch.
	 * @return String - the choice light or dark
	 */
	public static String getLD() {
		String input = getInput().toLowerCase();
		String validatedInput = "";
		switch(input) {
			case "l":
				validatedInput = "light";
				break;
			case "d":
			    validatedInput = "dark";
			    break;
			case "light|dark":
			    validatedInput = input;
			    break;
			default:
			    System.out.println("Invalid selection, please try again.");
		}
		return validatedInput;
	}

	
}