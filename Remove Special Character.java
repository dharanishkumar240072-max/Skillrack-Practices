import java.util.*;
public class Hello {
     public static void main(String[] args) {
		     Scanner sc = new Scanner(System.in);
		     String s = sc.next();
		     String result = "";
		     for(int i=0; i<s.length(); i++){
		          char c= s.charAt(i);
		          if(Character.isLetterOrDigit(c)){
		               result = result+c;
		          }
		     }
		     System.out.println(result);

	  }
}
