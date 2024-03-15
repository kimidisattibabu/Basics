package Ashokit;

class Player{
	int id;
	String name;
	int age;
}

public class Driver {
	
	void print(Player p1) {
		System.out.println(p1.id+"  "+p1.name+"  "+p1.age);
	}
	public static void main(String[] args) {
		Driver d = new Driver();
		Player p2 = new Player();
		p2.id = 1020;
		p2.name = "Aldd";
		p2.age = 32;
		d.print(p2);
	}

}
