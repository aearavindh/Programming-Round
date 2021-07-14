import java.util.Scanner;

public class PseudoBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the binary number: ");
		int n = in.nextInt();
		
		while(n!=0) {
			int m=0, p=1, temp = n;
			while(temp>0) {
				int rem = temp%10;
				temp = temp/10;
				if(rem!=0)
					m += p;
				p *= 10;
			}
			System.out.print(m + " ");
			n -= m;
		}
		
		in.close();
	}

}
