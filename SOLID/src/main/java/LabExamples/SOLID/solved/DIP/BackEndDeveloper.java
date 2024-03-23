package LabExamples.SOLID.solved.DIP;

public class BackEndDeveloper implements Developer{

	public void writeJava() {
		System.out.println("Java code");
    }

	@Override
	public void develop() {
		writeJava();
		
	}
}
