import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		char c= 'a';
		for(int i=1;i<=N;i++){
		    for(int j=1;j<=N-i;j++){
		        System.out.print("-");
		    }
		    for(int k=1; k<=i; k++){
		        System.out.print(c--);
		    }
		    c += (i+1);
		    System.out.print("\n");
		}

	}
}
