import java.io.*;
import java.util.*;

public class input() {
	private Scanner sc = new Scanner(System.in);

	public static String getInput() {
		return sc.next();
	}

	public static String getLD() {
		String choice = sc.nextLine().toLowerCase();
		if(choice.matches("light|dark"))
			return choice;
		else if (input.equals("l")) 
			return "light";
		else if (input.equals("d"))
			return "dark";
		else if (input.equals("q"))
			System.exit();
		else {
			System.out.println("Invalid selection, please try again.");
			getLD();
		}
	}
}