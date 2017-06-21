import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int numOfInputs = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < numOfInputs; i++) {
			String [] numbers = sc.nextLine().split(" ");
			int left = Integer.parseInt(numbers[0]);
			int right  = Integer.parseInt(numbers[1]);

			if (left < right) {
				System.out.println("<");
			} else if (left == right){
				System.out.println("=");
			} else {
				System.out.println(">");
			}
		}
		sc.close();
	}
}