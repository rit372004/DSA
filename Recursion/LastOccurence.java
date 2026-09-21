package Recursion;

public class LastOccurence {
    public static int lastOccu(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        //look forward
        int isfound = lastOccu(arr, i+1, key);
        if(isfound != -1) {
            return isfound;
        }

        //compare with self
        if (arr[i] == key) {
            return i;
        }

        return isfound;

    }
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccu(arr, 0, 5));
    }
}
