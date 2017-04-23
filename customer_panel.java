package pms;
import java.util.Scanner;

public class customer_panel extends login_all implements login_criteria {
	//yaha login data kii zarurat nii ussy direct login_all kii class mai daalo
	Scanner sc = new Scanner(System.in);
	public void user_old(){
		System.out.println("YOU ARE NOW LOGGED IN AS customer");
	}
	
	public void userOptions()
	{
		System.out.println("Which service do you want to avail?");
		System.out.println("Press 0 to Quit \r\n Press 1 to apply for charachter certificate \r\n Press 2 to check Traffic Offenses \r\n"
				+ "Press 3 to check Crash Reports \r\n Press 4 to Report a Crime"
				+ "\r\n Press 5 to Tell us about an officer \r\n Press 6 to check Arrest Records \r\n Press 7 to check Crime Stats"
				+ "\r\n Press 8 to File a Complaint \r\n Press 9 to Check Wanted List ");
		int option = sc.nextInt();
		if(option==1){
			characterCertificate();
		} else if(option==2){
			chkTrafficOffenses();
		} else if(option==3){
			crashReports();
		} else if(option==4){
			crimeReporting();
		} else if(option==5){
			complimentAnOfficer();
		} else if(option==6){
			arrestRecords();
		} else if(option==7){
			crimeStats();
		} else if(option==8){
			fileAcomplaint();
		} else if(option==9){
			wantedList();
		}
		 else if(option==0){
				thankYou();
			}
		else{
			System.out.println("Are you drunk? Choose between 0 to 9");
			userOptions();
		}
		
	}
	
	public void characterCertificate(){
		System.out.println("You have applied for the certificate");
		userOptions();
	}
	
	public void chkTrafficOffenses(){
		System.out.println("Enter the regitration number of your vehicle to see details");
		userOptions();
	}
	
	public void crashReports(){
		System.out.println("Enter the year to generate Traffic Crash report");
		userOptions();
	}
	
	public void crimeReporting(){
		System.out.println("Tell us your location");
		userOptions();
	}
	
	public void complimentAnOfficer(){
		System.out.println("Tell us about the officer you met");
		userOptions();
	}
	
	public void arrestRecords(){
		System.out.println("Enter ID# to see if the person is under arrest");
		userOptions();
	}
	
	public void crimeStats(){
		System.out.println("Enter your area to check crime statistics");
		userOptions();
	}
	
	public void fileAcomplaint(){
		System.out.println("Tell us what you have been through");
		userOptions();
	}
	
	public void wantedList(){
		System.out.println("Details of wanted criminals of your city");
		userOptions();
	}
	public void thankYou()
	{
		System.out.println("Thank you for visiting \r\n Your well wishers \r\n POLICE");
	}
	
}
