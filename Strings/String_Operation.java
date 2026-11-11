package Strings;

import java.util.Scanner;

public class String_Operation {

    public static void printLetters (String str) {
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        //String are immutable

        //Input
        Scanner sc = new Scanner(System.in);
        String firstname =  sc.nextLine();

        //Output
        System.out.println(firstname);

        //Length
        System.out.println(firstname.length());

        //Concatenation
        String lastName = "Kumar";
        String fullName = firstname + lastName;
        System.out.println(fullName);

        //charAt Method
        System.out.println(lastName.charAt(1));

        printLetters(fullName);
        

    }
    
}
