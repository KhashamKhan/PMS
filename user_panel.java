package pms;

import java.util.Scanner;

public class user_panel extends login_all implements login_criteria {
	//yaha login data kii zarurat nii ussy direct login_all kii class mai daalo
        @Override
	public void user_old(){
		System.out.println("can make changes to HIS/HER ACCOUNT and changes can also be made by admin");	
	}
        public void userOptions()
	{
		System.out.println("Welcome Officier");

		System.out.println("What do you want?");
		System.out.println("Press 0 to Quit \r\n Press 1 to check complain \r\n Press 2 to write FIR \r\n"
				+ "Press 3 to check Crisis \r\n Press 4 to Patrol"
				+ "\r\n Press 5 to complain against customer \r\n Press 6 to check Crime Reports \r\n Press 7 to take Actions"
				+ "\r\n Press 8 for Natural Disaster \r\n Press 9 for Terrorism ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if(option==1){
			chkcomplain();
		} else if(option==2){
			fir();
		} else if(option==3){
			crisis();
		} else if(option==4){
			patrol();
		} else if(option==5){
			customercomplain();
		} else if(option==6){
			crimereport();
		} else if(option==7){
			action();
		} else if(option==8){
			disaster();
		} else if(option==9){
			terrorism();
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
	public void chkcomplain()
	{
		System.out.println("Thank you for visiting \r\n Your well wishers \r\n POLICE");
	}
	public void fir()
	{
		System.out.println("Thank you for visiting \r\n Your well wishers \r\n POLICE");
	}
	public void crisis()
	{
		System.out.println("Thank you for visiting \r\n Your well wishers \r\n POLICE");
	}
	public void patrol()
	{
		System.out.println("Thank you for visiting \r\n Your well wishers \r\n POLICE");
	}
	public void customercomplain()
	{
		System.out.println("Thank you for visiting \r\n Your well wishers \r\n POLICE");
	}
	public void crimereport()
	{
		System.out.println("Thank you for visiting \r\n Your well wishers \r\n POLICE");
	}
	public void action()
	{
		System.out.println("Thank you for visiting \r\n Your well wishers \r\n POLICE");
	}
	public void disaster()
	{
		System.out.println("Thank you for visiting \r\n Your well wishers \r\n POLICE");
	}
	public void terrorism()
	{
		System.out.println("Thank you for visiting \r\n Your well wishers \r\n POLICE");
	}
}
