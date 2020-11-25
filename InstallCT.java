import java.io.*;
import java.util.*;

public class InstallCT {
	private String installDir;
	private Input input;
	private Output output;
	private boolean locConfirmed;

	public InstallCT() {
		installDir = "";
		locConfirmed = false;

	}
	public void startInstall() {
		System.out.println("Is your BlueJ directory in the default location?");
		System.out.println("( C:\\Program Files ) [y/n]: ");
		String inputted = input.getInput();
		String confirmed = "n";
		String customLoc = "";

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

	/*
	public String getInstallDir() {
		return installDir;
	}
	*/
	/*

	public void makeInstallBAT() throws FileNotFoundException {
		omakeInstallBAT(installDir);

	}
	/*
	public void makeShortcutBAT() {
		output.makeShortcutBAT();

	}
	*/





}