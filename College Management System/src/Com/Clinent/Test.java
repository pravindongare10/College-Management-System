package Com.Clinent;
import java.util.Scanner;
import Com.service.Cjc;
import Com.serviceImplimentation.Karvenager;
import Com.model.*;
public class Test {
	public static void main(String []args)
	{
		Cjc cjc=new Karvenager();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter Your Choice :1.AddCourse 2.ViewCourse 3. AddFaculty 4.ViewFaculty 5.AddBach 6.View 7.AddStudent 8.ViewStudent 9.Exit :");
			System.out.println("Choice is Yours:");
			int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
			cjc.addCourse();
			break;
			case 2:
				cjc.viewCourse();
				break;
			case 3:
				cjc.addFaculty();
				break;
			case 4:
				cjc.viewFaculty();
				break;
			case 5:
				cjc.addBatch();
				break;
			case 6:
				cjc.viewBatch();
				break;
			case 7:
				cjc.addStudent();
				break;
			case 8:
				cjc.viewStudent();
			case 9 :
				System.exit(0);
				
			default:
				System.out.println("That is not a valid option. Please choose again.");	
		}
		
		}while(true);
	}
}

