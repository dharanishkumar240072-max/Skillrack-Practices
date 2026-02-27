import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        boolean found = false;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == M) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}
