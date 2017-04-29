package pms;
import java.util.Scanner;

public class CustomerPanel extends login_all implements login_criteria {
	//yaha login data kii zarurat nii ussy direct login_all kii class mai daalo
    @Override
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
        try (Scanner sc = new Scanner(System.in)) {
            int option = sc.nextInt();
            switch(option){
                case (1):
                    System.out.print("kia bhand hai");
                    CharacterCertificate cc = new CharacterCertificate();
                    cc.characterCertificate();
                    break;
                case (2):
                    CheckTrafficOffenses cto = new CheckTrafficOffenses();
                    cto.chkTrafficOffenses();
                    break;
                case(3):
                    CrashReports crprts =new CrashReports();
                    crprts.crashReports();
                    break;
                case(4):
                    CrimeReporting cr = new CrimeReporting();
                    cr.crimeReporting();
                    break;
                case(5):
                    ComplimentAnOfficer cao = new ComplimentAnOfficer();
                    cao.complimentAnOfficer();
                    break;
                case(6):
                    ArrestRecords ar = new ArrestRecords();
                    ar.arrestRecords();
                    break;
                case(7):
                    CrimeStats cs = new CrimeStats();
                    cs.crimeStats();
                    break;
                case(8):
                    FileAComplaint fac = new FileAComplaint();
                    fac.fileAcomplaint();
                    break;
                case(9):
                    WantedList wl = new WantedList();
                    wl.wantedList();
                    break;
                case(0):
                    ThankYou ty = new ThankYou();
                    ty.thankYou();
                    break;
                default:
                    CustomerOptionsError coe = new CustomerOptionsError();
                    coe.customerOptionsError();
                    break;
            }
        }
	}
}
