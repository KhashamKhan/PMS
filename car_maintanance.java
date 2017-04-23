package pms;

public class car_maintanance extends vehicle_maintanance implements maintanance{
	
	public void detail(int car_id){
	System.out.println("details of car");	
	}
	public void c_part(){
		System.out.print("detail of part that is been changed or upgraded");
	}
}
