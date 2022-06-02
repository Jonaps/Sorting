
/*
Write a method to find the number of times an element repeats in the array
 */
public class Find {

    public static int count(int[] arr, int key) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9};
        System.out.println(count(arr,5));

    }
}
