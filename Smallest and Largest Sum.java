import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		    int A = sc.nextInt();
				int B = sc.nextInt();
		    int C = sc.nextInt();
		    int D = Math.min(Math.min(A,B),C);
		    int E = Math.max(Math.max(A,B),C);
		    System.out.println(D+E);
    }
}
