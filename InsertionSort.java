import java.util.Scanner;


public class InsertionSort {
    
    public static void insertionSort(int[] myArray) {
        for(int j = 1; j < myArray.length; j++) {
            int current = myArray[j];
            int k;
            for(k = j - 1; k >= 0 && myArray[k] > current; k--) {
                myArray[k + 1] = myArray[k];
            }
            myArray[k + 1] = current;
        
        }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " numbers.");
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        insertionSort(arr);
        for(int e: arr) {
            System.out.print(e + " ");
        }
    
    }
}
