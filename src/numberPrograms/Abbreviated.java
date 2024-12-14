package numberPrograms;
import java.util.Scanner;
public class Abbreviated {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your first name");
char FirstName=sc.next().charAt(0);

System.out.println("enter your middle name");
char MiddleName=sc.next().charAt(0);

System.out.println("enter your last name");
String LastName=sc.next();

System.out.println("Abbreviated Name = "+FirstName+"."+MiddleName+"."+LastName);
sc.close();
	}

}
