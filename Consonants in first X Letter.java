import java.util.*;
public class Hello {

    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int X = sc.nextInt();
		String result="";
		String vow = "aeiouAEIOU";
		
		for(int i=0; i<X && i<S.length(); i++){
		    char ch = S.charAt(i);
		    if(ch !='a' && ch !='e' && ch != 'i' && ch !='o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
		        result = result +ch;
		    }
		}
		
		if(result.length() == 0){
		    System.out.print("-1");
		}
		else{
		    System.out.print(result);
		}

	}
}
