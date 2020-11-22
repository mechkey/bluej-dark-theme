import java.io.*;
import java.util.*;

public class changeTheme {
	private File[] sfiles;
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Input light or dark: ");
		
		File sd = new File(".\\bluej-css\\"+getInput() );
		String ddStr = ".\\bluej\\lib\\stylesheets\\";
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
	public static String getInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		if(input.matches("light|dark"))
			return input;
		else if (input.equals("l")) 
			return "light";
		else if (input.equals("d"))
			return "dark";
		else {
			System.out.println("Invalid input");
			return "Error";
		}
	}
}