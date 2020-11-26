import java.io.*;
import java.util.*;

public class Install {
	private static String installDir;
	private Input  in;
	private Output out;

	/**
	 * Constructor for InstallCT class.
	 */
	public Install() {
		in = new Input();
		out = new Output();
	}

	public static void main(String[] args) {
		Install install = new Install();
		install.startInstall();
	}
	/**
	 * Main method that gets the install directory from the user
	 *
	 */
	public void startInstall() {
		System.out.println("Please press <Enter> to continue . . .");
		String inputted;
		inputted = in.getInput();
		do {
			System.out.println("Is your BlueJ directory in the default location?");
			System.out.println("( C:\\Program Files ) [y/n]: ");
			inputted = in.getInput();
		} while (!(inputted.equals("y") || (inputted.equals("n")) || (inputted.equals("q"))));

		String customLoc;
		if (inputted.equals("y")) {
			installDir = "C:\\Program Files";
			System.out.println("BlueJ is installed in the " + installDir + " directory");

		}
		else if (inputted.equals("n")) {
			System.out.println("Please enter the full path of your install location: ");
			System.out.println("C:\\path\\to\\parent\\directory");
			customLoc = in.getInput();
			System.out.println("BlueJ is installed in the " + customLoc + " directory");
			installDir = customLoc;
			//Cannot get confirmation if block to work...
		} else if (inputted.equals("q")) {
			System.exit(0);
		}

		try {
			String make = out.makeInstallBAT(installDir);
			System.out.println(make);
			String shortcut = out.makeShortcutBAT(installDir);
			System.out.println(shortcut);
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