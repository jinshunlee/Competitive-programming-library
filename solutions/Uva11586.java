import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine(); //go to end of this line
		for (int i = 0; i < num; i++) {
			String line = sc.nextLine();
			int F = 0, M = 0;
			for(int j = 0; j < line.length(); j++) {
				if(line.charAt(j) == 'F') {
					F++;
				} else if(line.charAt(j) == 'M') {
					M++;
				}
			}
			if (M == F && line.length() > 2){
				System.out.println("LOOP");
			} else {
				System.out.println("NO LOOP");
			}
		}
	}
}