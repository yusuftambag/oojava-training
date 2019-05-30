package yte.summerp.oopjava.polymorphism;

public class KickerMainTest {
	public static void main(String argv[]) {
		Polyanna polyanna = new Polyanna();
		polyanna.kicked();
		Goat goat=new Goat();
		goat.kick(polyanna);
	}
}
