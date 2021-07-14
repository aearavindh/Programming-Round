import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String s = in.next();
		int n = s.length();
		int half = n/2;
		for(int i=0;i<=n;i++) {
			int spaces = n-1-i;
			int indexToPrint = i + half;
			String st = "";
			if(indexToPrint>n-1)
				st = s.substring(half) + s.substring(0, indexToPrint%n);
			else
				st = s.substring(half, indexToPrint);
			while(spaces-- >= 0)
				System.out.print(" ");
			System.out.print(st);
			System.out.println();
		}
        in.close();
	}

}