import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		char prev,next;
		if(c == 'a'){
		    prev='z';
		    next='b';
		    System.out.print(prev);
		    System.out.print(next);
		}
		else if(c == 'z'){
		    prev = 'y';
		    next = 'a';
		    System.out.print(prev);
		    System.out.print(next);
		}
		else{
		    System.out.print((char)(c-1));
		    System.out.print((char)(c+1));
		}
	}
}
