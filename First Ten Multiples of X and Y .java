import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c =0;
	    int d=1;
        
        while(c<10){
            if(d%a == 0 || d%b == 0){
                System.out.print(d+" ");
                c++;
            }
            d++;
        }
	}
}
