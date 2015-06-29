import java.util.*;

public class DigitMachine {

	// Two-loop solution

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean justStarting = true;
		int total = 0;
		int number = 0;
		boolean previous = false;
		String s;
		while (true) {
		    s = scanner.nextLine();
		    if (".".equals(s)) {
		    	if (previous) {
		    		System.out.println(total);
		    		return;
		    	}
		    	previous = true;
		    	System.out.println(number);
		    	total += number;
		    	number = 0;
		    } else if (s.length() != 1) {
		    	System.out.println("Must enter one digit.");
		    } else  {
		    	int x = Integer.parseInt(s);
		    	number = number * 10;
		    	number = number + x;
		    	previous = false;
		    }

		}
	}

}
