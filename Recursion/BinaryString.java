package Recursion;

public class BinaryString {
    public static void printBinaryString(int n, int lastPlace, String str) {

        // base case
        if (n == 0) {
            System.out.println(str);
            return ;
        }

        // kaam
        if (lastPlace == 0) { // nth place = 0 
            printBinaryString(n - 1, 0, str + "0");
            printBinaryString(n - 1, 1, str + "1");
        } 
        else { // nth place = 1
            printBinaryString(n - 1, 0, str + "0");
        }

    }

    public static void main(String[] args) {
        printBinaryString(3, 0, (""));
    }
}
