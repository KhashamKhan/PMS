package pms;

import java.util.Scanner;

public class mobile implements mobile_requirments {
	private static Scanner reader = new Scanner(System.in);
	String vehicle_company;
	String vehicle_name ="";
	int engine_num=0;
	int registration_num =0;
	//NEW VEHICLE KAA DATA YAHA SAVE HOJAIGA
	public int new_car(int car_id){
		System.out.println("ENTER COMPANY NAME OF VEHICLE");
		vehicle_company = reader.nextLine();
		System.out.println("ENETER VEHICLE NAME");
		vehicle_name = reader.nextLine();
		System.out.println("ENTER VEHCILE ENGINE  NUMBER");
		engine_num = reader.nextInt();
		System.out.println("ENTER VEHICLE REGISTRATION NUMBER");
		registration_num= reader.nextInt();
		return car_id;
	}
}
