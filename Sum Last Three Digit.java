import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N%10;
		int b = (N%100)/10;
		int c = (N%1000)/100;
		
		System.out.print(a+b+c);

	}
}
