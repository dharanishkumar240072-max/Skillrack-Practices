public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {5, 12, 3, 8, 19, 7};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest number is: " + secondLargest);
    }
}
