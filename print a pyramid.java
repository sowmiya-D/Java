import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the level of pyramid: ");
		int num = sc.nextInt();
		int i,j;
		int variable=1,reversevar=2;
		for(i=0;i<num;i++) {
			for(j=0;j<num;j++) {
				if(j<num-i-1) {
					System.out.print(" ");
				}
				else {
					System.out.print(variable);
					variable++;
					if(variable==10)
						variable=0;
				}
			}
			if (variable==1)
				reversevar = 9;
			else
				reversevar = variable - 2;
			for(j=0;j<i;j++) {
				System.out.print(reversevar);
				reversevar--;
				if(reversevar==-1)
					reversevar=9;
			}
			System.out.println();
		}
	}
	
}
