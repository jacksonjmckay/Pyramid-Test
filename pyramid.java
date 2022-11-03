import java.util.Scanner;
public class challenge2 {
	public static void main(String[] args) {
		System.out.println("Enter number of layers.");
		Scanner input = new Scanner(System.in);
		int userNum = input.nextInt();
		
		for (int i = 1; i <= userNum; ++i) {
			
			for(int x = i; x < userNum; ++x) {
				System.out.print(" ");
			}
			
			for(int y = 1; y <(i * 2); ++y) {
				System.out.print("-"); 
			}
			
			System.out.print("\n");
		}

		input.close();
		System.out.print("END");
	}
}
