import java.io.*;
import java.util.*;

public class input() {
	private Scanner dsc;

	public void makeInstallBAT() {
		PrintStream stringToFile = new PrintStream("install.bat");
        stringToFile.println("ICACLS \"" + install.getInstallDir() + "\\BlueJ\" /grant:r \"everyone\":(F) /C /t");
        stringToFile.println("If you received an error, right click install.bat and select \"Run as Administrator\".");
		stringToFile.println("javac changeTheme.java");
      	stringToFile.close();
    }
	

	public void makeShortcutBAT() {
		PrintStream stringToFile = new PrintStream("BlueJ.bat");
		stringToFile.println("cd \"" + install.getInstallDir() + "\\BlueJ\""); 
		stringToFile.println("start BlueJ.exe");
      	stringToFile.close();
	}
}

/*
cd "C:\Program Files\BlueJ"
start BlueJ.exe
*/