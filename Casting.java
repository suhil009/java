package CORE;

public class Casting {
public static void main(String[]args) {
	 
	
	int x = 400023;
	short y = 23;
	byte z = 84;
	
	long sam = 50000+ 10*(x+y+z);
	System.out.println(sam);
	
	short shortTotal = (short) (1000+19 *
			(x+y+z));
	System.out.println(shortTotal);
}
}
