package pms;
import java.util.Scanner;

public class CustomerPanel extends Login_All implements Login_Criteria {
	//yaha login data kii zarurat nii ussy direct login_all kii class mai daalo
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
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if(option==1){
			CharacterCertificate cc = new CharacterCertificate();
			cc.characterCertificate();
		} else if(option==2){
			CheckTrafficOffenses cto = new CheckTrafficOffenses(); 
		 	cto.chkTrafficOffenses();
		} else if(option==3){
			CrashReports crprts =new CrashReports();
			crprts.crashReports();
		} else if(option==4){
			CrimeReporting cr = new CrimeReporting();
			cr.crimeReporting();
		} else if(option==5){
			ComplimentAnOfficer cao = new ComplimentAnOfficer();
			cao.complimentAnOfficer();
		} else if(option==6){
			ArrestRecords ar = new ArrestRecords();
			ar.arrestRecords();
		} else if(option==7){
			CrimeStats cs = new CrimeStats();
			cs.crimeStats();
		} else if(option==8){
			FileAComplaint fac = new FileAComplaint();
			fac.fileAcomplaint();
		} else if(option==9){
			WantedList wl = new WantedList();
			wl.wantedList();
		}
		 else if(option==0){
			ThankYou ty = new ThankYou(); 	
			 ty.thankYou();
			}
		else{
			CustomerOptionsError coe = new CustomerOptionsError();
			coe.customerOptionsError();
		}
		sc.close();
	}
}
