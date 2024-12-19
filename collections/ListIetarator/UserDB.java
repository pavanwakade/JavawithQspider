package ListIetarator;

import java.util.ArrayList;
import java.util.Collections;

public class UserDB {

	public static void main(String[] args) {
		ArrayList<User> al=new ArrayList<>();
		al.add(new User(1,"pavan ",2000));
		al.add(new User(2,"Shashi",3000));
		al.add(new User(3,"kedar ",10000));
		al.add(new User(4,"Nvnath",5000));
		al.add(new User(5,"Shubhm",1000));
		al.add(new User(6,"Ranjit",500));
		al.add(new User(7,"vishal",6577.9));
		al.add(new User(8,"Yogesh",7440.9));
		al.add(new User(9,"Sandip",949.9));
		al.add(new User(10,"Akash ",4370.9));
		al.add(new User(11,"ganesh",5560.9));
		al.add(new User(12,"Sonali",83335.9));
		
		Collections.sort(al);
		printDB(al);
}

	public static void printDB(ArrayList<User>al)
	{
		for (User User :al) {
			System.out.println(User);		
		}
	}
	
	
}