import java.util.*;
public class Main {
	public static void main(String[] args) {
		int num=8;
		int a =num*num;
		while(true){
			a=num*num;
			if(a%21==0 && a%36==0 && a%66==0){
				break;
			}
			num++;
		}
		System.out.println(a);
	}
}
