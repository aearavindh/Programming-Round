import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternateSorting {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the array: ");
		String[] s = br.readLine().trim().split("\\s+");
		int n = s.length;
		int[] input = new int[n];
		for(int i=0;i<n;i++)
			input[i] = Integer.parseInt(s[i]);
		
//		Got the input
		
		for(int i=0;i<n;i++) {
			int minOrMax = i;
			for(int j=i+1;j<n;j++) {
				if(i%2==0) {
					if(input[j]>input[minOrMax]) {
						minOrMax = j;
					}
				} else {
					if(input[j]<input[minOrMax]) {
						minOrMax = j;
					}
				}
			}
			if(i!=minOrMax) {
				int temp = input[i];
				input[i] = input[minOrMax];
				input[minOrMax] = temp;
			}
		}
		
		for(int el:input) {
			System.out.print(el + " ");
		}

	}

}
