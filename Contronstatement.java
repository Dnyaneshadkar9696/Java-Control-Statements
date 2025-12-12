
public class Contronstatement {
	public static void main(String[] args) {
		// Control statements are of three types 
		// 1) Condition Statement
		// 2) Looping Statement
		// 3) Jump statement 
		
		// Contronl statements are all - if, ifelse, ifelseif , and switch statements
		// loop statements are - for, while and do 
		// Jump statements are - break , return and continue
		
		int a = 1;
		switch(a) {
		// It will check value of a with each case 
		case 1:
			System.out.println("Monday");
			break;
			// inserting break here is important , if not inserted then it will continue until break is found.
			
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		}
	}
}
