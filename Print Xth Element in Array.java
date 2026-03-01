import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++){
		    arr[i] = sc.nextInt();
		}
		int X = sc.nextInt();
		System.out.print(arr[X+1]);

	}
}
