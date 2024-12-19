package ListIetarator;

import java.util.Collection;

public class User implements Comparable<User>{
int id;
String name;
double amount;

	public User() {
	}
	/**
	 * @param id
	 * @param name
	 * @param amount
	 */
	public User(int id, String name, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
	@Override
	public int compareTo(User user)
	{
		if (this.id>user.id) {
			return 1;
		}
		else if (this.id<user.id) {
			return -1;
		}
		return 0;
	}
}
