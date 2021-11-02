package HilosCine;

import java.util.ArrayList;
import java.util.Iterator;

public class Ticket {
	
	public static void main(String[] args) {
	
		Cinema cinema = Cinema.getCinema();
		ArrayList<User> users = new ArrayList<>();

		for (int i = 0; i < 300; i++) {
			users.add(new User(cinema));
		}
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			user.start();
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
	}
}
