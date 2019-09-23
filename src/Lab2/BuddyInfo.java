package Lab2;

public class BuddyInfo {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo i = new BuddyInfo();
		i.setName("aaa");
		System.out.println("Hello "+i.getName());
	}

}
