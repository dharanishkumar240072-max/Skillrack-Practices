import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a%10 > b%10){
		    System.out.print(b+" "+ a);
		}
		else if(a%10 == b%10){
		    if(a>b){
		        System.out.print(a+" "+b);
		    }
		    else{
		        System.out.print(b+" "+a);
		    }
		}
		else{
		    System.out.print(a +" "+ b);
		}

	}
}
