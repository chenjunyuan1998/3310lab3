package Lab2;

import java.util.LinkedList;

public class AddressBook {
	private LinkedList <BuddyInfo> info;
	public void addBuddy(BuddyInfo a){
		if(a!=null) {
			info.add(a);
		}
	}
	public void removeBuddy(int a) {
		if(a>=0&&a<info.size()) {
			info.remove(a);
		}
	}
	public static void main(String[] args) {
		System.out.println("Address Book");
		BuddyInfo b = new BuddyInfo();
		b.setName("aaa");
		AddressBook a = new AddressBook();
		a.addBuddy(b);
		a.removeBuddy(0);
		a.addBuddy(b);
	}
}

