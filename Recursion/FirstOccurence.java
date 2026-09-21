package Recursion;

public class FirstOccurence {
    public static int firstOccu(int arr[], int i, int key) {
        if ( i == arr.length) {
            return -1;
        }
        //Check with self
        if (arr[i] == key) {
            return i;
        }
        //Look Forward
        return firstOccu(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        System.out.println(firstOccu(arr, 0, 5));

    }
}
