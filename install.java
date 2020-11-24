import java.io.*;
import java.util.*;

public class install {
	private String installDir = "";
	private Input input;

	public void main(String[] args) {
		boolean dirNotSet = true;
		while (dirNotSet)
		{
			System.out.println("Is your BlueJ directory in the default location?");
			System.out.println("( \"C:\\Program Files\\ ) [y/n]: ");
			if (input.getInput() == "y|Y") {
				installDir = "C:\\Program Files";
				dirNotSet = false;
			}
			else {
				System.out.println("Please enter the full path of your install location: ")
				System.out.println("C:\\path\\to\\parent\\directory")
				installDir = input.getInput();
				System.out.println("BlueJ is install in the " + installDir + " directory");
				System.out.println("Is this correct? [y/n]: ");
				if (input.getInput() == "y|Y") {
					dirNotSet = false;
				}
			}
		}
	}

		output.makeInstallBAT();
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