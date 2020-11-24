import java.io.*;
import java.util.*;

public class changeTheme {
	private File[] sfiles;
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Input light or dark [l/d]: ");
		
		File sd = new File("bluej-css\\" + input.getLD());
		String ddStr = install.getInstallDir() + "\\BlueJ\\lib\\stylesheets\\";
		File[] sfiles = sd.listFiles();
		
		for (File sfile : sfiles) 
		{
			Scanner dsc = new Scanner(sfile);
			PrintStream stringToFile = new PrintStream(ddStr + sfile.getName());
	      	while (dsc.hasNext())
	      	{
		        stringToFile.println(dsc.nextLine());
	        }
	      	dsc.close();
	      	stringToFile.close();
	    }
	}
}