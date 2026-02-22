import java.util.*;
public class SortSameUnitDigit{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		
		int a = X%10;
		int b = Y%10;
		int c = Z%10;
		
		int s,l,rem;
		
		if(a == b){
		    s = Math.min(X,Y);
		    l = Math.max(X,Y);
		    rem = Z;
		}
		else if(b == c){
		    s= Math.min(Y,Z);
		    l = Math.max(Y,Z);
		    rem = X;
		}
		else{
		    s = Math.min(X,Z);
		    l = Math.max(X,Z);
		    rem = Y;
		}
		System.out.print(s+" "+l+" "+rem);

	}
}
