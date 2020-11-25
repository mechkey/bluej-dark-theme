import java.io.*;
import java.io.PrintStream;
import java.util.*;

public class Output {

	/**
	 * This method makes a .bat file that changes permissions on the BlueJ
	 * folder. This allows the ChangeTheme class to do it's just
	 * @param pInstallDir the installation directory of BlueJ
	 * @return a message of success after the method has run.
	 */
	public static String makeInstallBAT(String pInstallDir) throws FileNotFoundException {
		PrintStream strToFile = new PrintStream("install.bat");
        strToFile.println("ICACLS \"" + pInstallDir + "\\BlueJ\" /grant:r \"everyone\":(F) /C /t");
        strToFile.println("If you received an error, right click install.bat and select \"Run as Administrator\".");
		strToFile.println("javac changeTheme.java");
      	strToFile.close();
      	return "makeInstallBAT successful!";
    }
	
    /**
	 * This method makes a .bat file that selects the appropriate CSS files then runs BlueJ
	 * @param pInstallDir the installation directory of BlueJ
	 * @return a message of success after the method has run.
	 */
	public static String makeShortcutBAT(String pInstallDir) throws FileNotFoundException {
		PrintStream strToFile = new PrintStream("BlueJ.bat");
		strToFile.println("cd \"" + pInstallDir + "\\BlueJ\""); 
		strToFile.println("start BlueJ.exe");
      	strToFile.close();
      	return "makeShortcutBAT successful!";

	}
}

/*
cd "C:\Program Files\BlueJ"
start BlueJ.exe
*/