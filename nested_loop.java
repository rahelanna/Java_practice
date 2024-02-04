import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol;
		
		System.out.println("Enter rows: ");
		rows = scanner.nextInt();
		
		System.out.println("Enter columns: ");
		columns = scanner.nextInt();
		
		System.out.println("Enter symbol: ");
		symbol = scanner.next();
		
		for(int i = 1; i <= rows; i++) {
			System.out.println();
			for(int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}
			
	}
	}