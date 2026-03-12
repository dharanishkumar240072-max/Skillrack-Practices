import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int len = S.length();
		System.out.print(S.substring(0,2));
		System.out.print(S.substring(len-2, len));
		

	}
}
