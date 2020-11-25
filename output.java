import java.io.*;
import java.util.*;

public class Output {
	public String makeInstallBAT(String pInstallDir) throws FileNotFoundException {
		PrintStream stringToFile = new PrintStream("install.bat");
        stringToFile.println("ICACLS \"" + pInstallDir + "\\BlueJ\" /grant:r \"everyone\":(F) /C /t");
        stringToFile.println("If you received an error, right click install.bat and select \"Run as Administrator\".");
		stringToFile.println("javac changeTheme.java");
      	stringToFile.close();
      	return "makeInstallBAT successful!";
    }
	

	public String makeShortcutBAT(String pInstallDir) throws FileNotFoundException {
		PrintStream stringToFile = new PrintStream("BlueJ.bat");
		stringToFile.println("cd \"" + pInstallDir + "\\BlueJ\""); 
		stringToFile.println("start BlueJ.exe");
      	stringToFile.close();
      	return "makeShortcutBAT successful!";

	}
}

/*
cd "C:\Program Files\BlueJ"
start BlueJ.exe
*/