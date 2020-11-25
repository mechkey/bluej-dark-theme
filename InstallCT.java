import java.io.*;
import java.util.*;

public class InstallCT {
	private static String installDir;
	private static Input input;
	private static Output output;
	private static boolean locConfirmed;
	private static String confirmed;
	private static String customLoc;

	/**
	 * Constructor for InstallCT class.
	 */
	public InstallCT() {
		locConfirmed = false;
		input = new Input();
		output = new Output();
		confirmed = "n";
		customLoc = "";
	}

	public static void main(String[] args) {
		startInstall();
	}
	/**
	 * Main method that gets the install directory from the user
	 *
	 */
	public static void startInstall() {
		System.out.println("Is your BlueJ directory in the default location?");
		System.out.println("( C:\\Program Files ) [y/n]: ");
		String inputted = input.getInput();

		switch(inputted) {
			case "y": 
				installDir = "C:\\Program Files";
				break;
			case "n":
				System.out.println("Please enter the full path of your install location: ");
				System.out.println("C:\\path\\to\\parent\\directory");
				customLoc = input.getInput();
				System.out.println("BlueJ is installed in the " + customLoc + " directory");
				installDir = customLoc;
				//Cannot get confirmation if block to work...
				break;
			default:
				System.out.println ("Please input y or n");
		}	
		try {

			System.out.println(output.makeInstallBAT(installDir));
			System.out.println(output.makeShortcutBAT(installDir));
		} catch (FileNotFoundException e) {
			System.out.println("Caught exception: " + e);
		}
	}
	/**
	 * Getter for the install location
	 */
	public static String getInstallDir() {
		return installDir;
	}

}