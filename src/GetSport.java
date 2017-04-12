import java.util.Scanner;

public class GetSport {
	static int WhichSport(){
		System.out.println("Enter a sport: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		input = input.toLowerCase();
		switch(input){
		case("basketball"):
			return 0;
		case("golf"):
			return 1;
		case("baseball"):
			return 2;
		default:
			return 3;
		}
	}
}
