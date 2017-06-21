import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws NoSuchElementException{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine(); //skip nextLine

		for(int i = 0; i < num; i++) {
			int [] series = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int max = Arrays.stream(series).max().getAsInt();
			System.out.println("Case " + (i+1) + ": " + max);

		}
	}
}