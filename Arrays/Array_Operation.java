import java.util.Scanner;

public class Array_Operation {
    public static void main(String args[]) {
        
        //Creation
        int marks[] = new int[100];
        int numbers[] = {83, 98, 88};

        //Length
        System.out.println("length of array: " + marks.length);
        System.out.println("Length of array: " + numbers.length);

        // Input
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // output
        System.out.println("phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("math: " + marks[2]);

        // update
        marks[2] = 98;

        // change
        marks[2] = marks[2] + 1;
        System.out.println("math: " + marks[2]);

    }
}