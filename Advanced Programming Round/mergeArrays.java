import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mergeArrays {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the first array: ");
		String[] ar1 = br.readLine().trim().split("\\s+");
		int[] a = new int[ar1.length];
		for(int i=0;i<ar1.length;i++)
			a[i] = Integer.parseInt(ar1[i]);
		System.out.print("Enter the second array: ");
		ar1 = br.readLine().trim().split("\\s+");
		int[] b = new int[ar1.length];
		for(int i=0;i<ar1.length;i++)
			b[i] = Integer.parseInt(ar1[i]);
		
//		Got the inputs
		
		int m = a.length, n = b.length;
		int[] c = new int[m+n];
		int o = 0;
		
		if(a[0]<a[m-1] && b[0]>b[n-1]) {
			int i=0, j=n-1;
			while(i<m && j>=0) {
				if(o>0) {
					if(a[i]==c[o-1] || b[j]==c[o-1]) {
	            		i++;j--;
	            		continue;
	            	}
				}
				if(a[i]<b[j]) {
					c[o++] = a[i];
					i++;
				}else if(a[i]==b[j] || a[i]!=c[o-1]) {
					c[o++] = a[i];
					i++;j--;
				}else {
					c[o++] = b[j];
					j--;
				}
			}
			while(i<m) {
				if(a[i]!=c[o-1]) 
					c[o++] = a[i];
				i++;
			}
			while(j>=0) {
				if(b[j]!=c[o-1])
					c[o++] = b[j];
				j--;
			}
		} else if(a[0]>a[m-1] && b[0]<b[n-1]) {
			int i=m-1, j=0;
            while(i>=0 && j<n) {
            	if(o>0) {
            		if(a[i]==c[o-1] || b[j]==c[o-1]) {
                		i--;j++;
                		continue;
                	}
            	}
            	if(a[i]<b[j]) {
					c[o++] = a[i];
					i--;
				} else if(a[i]==b[j] || a[i]!=c[o-1]) {
					c[o++] = a[i];
					i--;j++;
				} else {
					c[o++] = b[j];
					j++;
				}
			}
            while(i>=0) {
            	if(a[i]!=c[o-1])
            		c[o++] = a[i];
            	i--;
            }
            while(j<n) {
            	if(b[j]!=c[o-1])
            		c[o++] = b[j];
            	j++;
            }
		} else if(a[0]>a[m-1] && b[0]>b[n-1]) {
			int i=m-1, j=n-1;
            while(i>=0 && j>=0) {
            	if(o>0) {
            		if(a[i]==c[o-1] || b[j]==c[o-1]) {
                		i--;j--;
                		continue;
                	}
            	}
            	if(a[i]<b[j]) {
					c[o++] = a[i];
					i--;
				} else if(a[i]==b[j] || a[i]!=c[o-1]) {
					c[o++] = a[i];
					i--;j--;
				} else {
					c[o++] = b[j];
					j--;
				}
			}
            while(i>=0) {
            	if(a[i]!=c[o-1])
            		c[o++] = a[i];
            	i--;
            }
            while(j>=0) {
            	if(b[j]!=c[o-1])
            		c[o++] = b[j];
            	j--;
            }
		} else {
			int i=0, j=0;
            while(i<m && j<n) {
            	if(o>0) {
            		if(a[i]==c[o-1] || b[j]==c[o-1]) {
                		i++;j++;
                		continue;
                	}
            	}
            	if(a[i]<b[j]) {
					c[o++] = a[i];
					i++;
				} else if(a[i]==b[j]) {
					c[o++] = a[i];
					i++;j++;
				} else {
					c[o++] = b[j];
					j++;
				}
			}
            while(i<m) {
            	if(a[i]!=c[o-1])
            		c[o++] = a[i];
            	i++;
            }
            while(j<n) {
            	if(b[j]!=c[o-1])
            		c[o++] = b[j];
            	j++;
            }			
		}
		
		for(int el: c) {
			if(el!=0)
				System.out.print(el + " ");
		}
		

	}

}
