package lesson1.lecture;

public class Operations {

	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		
		boolean isTrue = true;
		char c = 'H';
		String s = "Module";
		
		// logical operators
		boolean isItTrue = true || false;
		System.out.println(isItTrue);
		
		boolean stefchoIsHeavy = true;
		boolean iAmHeavy = false;
		System.out.println("Is Stefcho heavy? - " + !stefchoIsHeavy);
		
		// comparison
		int myAge = 27;
		int vladoAge = 20;
		
		boolean iAmOlderThanVlado = myAge > vladoAge;
		System.out.println(iAmOlderThanVlado);
		
		int x1 = 3;
		int x2;
		x2 = (x1 == 3) ? 5 : 7;
		
	}

}
