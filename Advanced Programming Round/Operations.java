import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = in.next();
		int half = s.length()/2;
		int output = Integer.parseInt(s.substring(0,1));
		
		for(int i=0;i<half;i++) {
			int nextValue = Integer.parseInt(s.substring(i+1, i+2));
			char operator = s.charAt(i+half+1);
			switch(operator) {
			case '+': output = output + nextValue;
				break;
			case '-': output = output - nextValue;
				break;
			case '*': output = output * nextValue;
				break;
			case '/': output = output / nextValue;
				break;
			}
		}
		System.out.print("Output: " + output);
		
		in.close();
	}

}

//input1: 12345*+-+
//input2: 374291--*+-
//input3: 67542-/+-
