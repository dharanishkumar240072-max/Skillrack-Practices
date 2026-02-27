import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for(int i=S.length() -1; i>=0; i--){
		    System.out.print(S.charAt(i));
		}

	}
}
