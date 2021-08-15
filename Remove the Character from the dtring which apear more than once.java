import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    char s[] = str.toCharArray();  
	    int x=0;
	    for(int i=0;i<s.length;i++){
	        int j;
	        for(j=0;j<i;j++){
	            if(s[i]==s[j]){
	                break;
	            }
	        }
	        if(j == i)    
            {   
                s[x++] = s[i];   
            }   
	    }
	    System.out.println(String.valueOf(Arrays.copyOf(s,x)));
	}
}
