import java.io.*;
import java.util.*;

public class Input {
	private Scanner sc;
	private String input;

	public Input() {
		sc = new Scanner(System.in);
	}

	public String getInput() {
		input = sc.nextLine();
		return input;
	}
	
	public String getLD() {
		String validatedInput = "";
		String input = sc.nextLine().toLowerCase();
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