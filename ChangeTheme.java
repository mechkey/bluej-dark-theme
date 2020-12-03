import java.io.*;
import java.io.PrintStream;
import java.util.*;

public class ChangeTheme {
	private Input in;
	private Install inst;
	
	public ChangeTheme() {
		in = new Input();
		inst = new Install();
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		ChangeTheme ct = new ChangeTheme();
		ct.change();
	}

	public void change() throws FileNotFoundException {
		System.out.println("Input light or dark [l/d]: ");
		
		//Get user preference and set sd to the folder containing the appropriate css.		
		File sd = new File("stylesheets\\" + in.getLD());
		
		//An array of file type containing the css files of the chosen theme for writing to the stylesheets directory
		//sfiles = sd.listFiles();
		File[] sfiles = sd.listFiles();

		//Set ddStr to the stylesheets directory using the install directory information.
		String ddStr = inst.getInstallDir() + "\\BlueJ\\lib\\stylesheets\\";
		
		//For each file that exists in the CSS folder, read it and then write it to the stylesheets folder.
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