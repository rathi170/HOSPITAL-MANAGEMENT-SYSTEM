package HospitalManagement;

import java.util.Scanner;

public class fecility {
	String fec_name;
	void add_feci()
	{
	Scanner input = new Scanner(System.in);
	System.out.print("fecility:-");
	fec_name = input.nextLine();
	}
	void show_feci()
	{
	System.out.println(fec_name);
	}
}
