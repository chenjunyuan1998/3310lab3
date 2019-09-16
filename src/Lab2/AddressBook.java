package Lab2;

import java.util.LinkedList;

public class AddressBook {
	private LinkedList <BuddyInfo> info;
	public void addBuddy(String a){
		BuddyInfo b=new BuddyInfo();
		b.setName(a);
		info.add(b);
	}
	public void removeBuddy(String a) {
		BuddyInfo b =new BuddyInfo();
		b.setName(a);
		if(info.contains(b)) {
			info.remove(b);
		}
	}
}
