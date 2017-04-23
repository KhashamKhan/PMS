package pms;

import java.util.Scanner;

public class admin_panel extends login_all implements login_criteria {
//yaha login data kii zarurat nii ussy direct login_all kii class mai daalo
	mobile mob;
	
	int chooose;
	int car_id;
	String car_type;
	Scanner reader = new Scanner(System.in);
	public void user_old(){
		vehicle_maintanance mai1;
		vehicle_maintanance mai2;
		vehicle_maintanance mai3;
		System.out.println("YOU ARE NOW LOGGED IN AS ADMIN");
		chooose = reader.nextInt();
		switch(chooose){
		case 1:
			System.out.println("ENTER CAR ID");
			car_id = reader.nextInt();
			mob = new mobile();
			mob.new_car(car_id);
			break;
		case 2:
			System.out.println("ENTER CAR ID");
			car_id = reader.nextInt();
			System.out.println("ENTER CAR type");
			car_type = reader.nextLine();
			mai2 = new car_maintanance();
			//mai3 = new Bike_maintainance();
			if(car_type == "bike")
			{
				mai2.detail(car_id);
				mai1.b_part();  //dekh yaha
			}	
			else if (car_type == "car")
			{
				mai3.detail(car_id);
				mai1.c_part(); //dekh yaha
			}
			mai2.detail(car_id);
					
			break;
		case 3:
			System.out.println("YOU ARE NOW LOGGED IN AS ADMIN");
			break;
		case 4:
			System.out.println("YOU ARE NOW LOGGED IN AS ADMIN");
			break;
		case 5:
			System.out.println("YOU ARE NOW LOGGED IN AS ADMIN");
			break;
		case 6:
			System.out.println("YOU ARE NOW LOGGED IN AS ADMIN");
			break;
		case 7:
			System.out.println("YOU ARE NOW LOGGED IN AS ADMIN");
			break;
		case 8:
			System.out.println("YOU ARE NOW LOGGED IN AS ADMIN");
			break;
		case 9:
			System.out.println("YOU ARE NOW LOGGED IN AS ADMIN");
			break;
		
		}
		
	}

}
