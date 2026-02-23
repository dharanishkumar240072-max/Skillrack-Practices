import java.util.*;
public class Hello {
    public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   int X = sc.nextInt();
		   int Y = sc.nextInt();
		   int A = Math.min(X,Y);
		   int B = Math.max(X,Y);
		   for(int i=A; i<=B; i++){
		       System.out.print(i+" ");
		   }
    }
}
