package LabExamples.SOLID.solved.DIP;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Developer devs = new BackEndDeveloper();
		List<Developer> devList = new ArrayList<Developer>();
		devList.add(devs);
		Project pr = new Project(devList);
		pr.implement();
	}

}
