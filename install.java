import java.io.*;
import java.util.*;

public class install {
	private String installDir = "";
	private Input input;

	public void setinstallDir () {
		System.out.println("Is your BlueJ installation in the default location?");
		System.out.println(" ( \"C:\\Program Files\\BlueJ ) [y/n]: ");
		if (input.getInput() == "y|Y")
			installDir = "C:\\Program Files";
		else {
			System.out.println("Please enter the full path of your install location: ")
			System.out.println("C:\\path\\to\\parent\\directory")
			installDir = input.getInput();
		}
	}

	public String getInstallDir() {
		return installDir;
	}

	public String makeInstallBAT(){
		output.makeInstallBAT();

	}
	public String makeShortcutBAT(){
		output.makeShortcutBAT();

	}

}