package pms;

import java.util.Scanner;

public class Login_All {
	String user_id;
	int password;
	String field;
	admin_panel al;
	user_panel ul;
	CustomerPanel cl;
	enum user{
		admin,customer,faculty
	}
	
	Scanner  reader = new Scanner(System.in);
	
	public void login(user u){
		//user ue = u;
		//label:  								//yaha masla hai goto nii horaha sahi
		
		
		System.out.println("ENTER USER ID");
		user_id = reader.nextLine();
		System.out.println("ENTEr password");
		password = reader.nextInt();
		
		switch (u){
		
			case admin:	
				if(user_id.equals("admin")&& password == 123)
				{
					al = new admin_panel();
					al.user_old();
				}
				else
				{
					System.out.println("RE-ENTER USER_ID AND PASSWORD for admin");
					//break label;
				}
				/*while (user_id != "admin" )
				{
					while(password != 123)
					{
						break label;
					}
				}*/
				break;
			case customer:

				if(user_id.equals("customer")&& password == 123)
				{
					cl = new CustomerPanel();
					cl.user_old();
				}
				else
				{
					System.out.println("RE-ENTER USER_ID AND PASSWORD");
					//break label;
				}
				break;
			case faculty:

				if(user_id.equals("faculty")&& password == 123)
				{
					ul = new user_panel();
					ul.user_old();
				}
				else
				{
					System.out.println("RE-ENTER USER_ID AND PASSWORD");
					//break label;
				}
				break;
			default:
				System.out.println("you have choosen an in correct field");
				break;
				}
		
		}
	}
