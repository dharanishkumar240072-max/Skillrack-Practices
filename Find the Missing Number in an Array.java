public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int n = 10;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        int missingNumber = expectedSum - actualSum;
      
        if (missingNumber > 0) {
            System.out.println("Missing number is: " + missingNumber);
        } else {
            System.out.println("No missing number found");
        }
    }
}
