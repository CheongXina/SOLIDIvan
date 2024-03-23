package LabExamples.SOLID.solved.SRP;

public class SRPMain {
	public static void main(String[] args) throws Exception
	  {
	    Journal j = new Journal();
	    j.addEntry("Welcome to CSCI 5308");
	    j.addEntry("Let's study the SOLID principles!");
	    System.out.println(j);

	    Persistence p = new Persistence();
	    String filename = "journal.txt";
	    p.saveToFile(j, filename, true);

	    // opens the file in notepad
	    Runtime.getRuntime().exec("notepad.exe " + filename);
	  }
}
