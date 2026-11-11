package Recursion;

public class SortedArray {
    public static boolean aceSorted(int arr[], int i) {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return aceSorted(arr, i+1);
    }

    public static boolean decSorted(int arr[], int i) {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] < arr[i+1]) {
            return false;
        }
        return decSorted(arr, i+1);
    }

    public static void main(String[] args) {

        // int arr[] = {1, 2, 3, 4, 5};
        // System.out.println(ascSorted(arr, 0));

        int arr[] = {5, 4, 3, 2, 1};
        System.out.println(decSorted(arr, 0));

    }
}
