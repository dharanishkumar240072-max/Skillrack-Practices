import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int printed =0;
		for(int i=0; i<N; i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=N-1; i>=0;i--){
		    if(arr[i]>=10 && arr[i] <=99){
		        System.out.print(arr[i]+" ");
		        printed=1;
		    }
		   
		}
		if(printed==0){
		    System.out.print("-1");
		}

	}
}
