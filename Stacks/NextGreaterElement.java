package Stacks;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // step1 - while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // step2 - if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            //step3 - push in s
            s.push(i);

        }

        for (int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }

    //next Greater Right

    //next Greater Left
    // for (int i=0; i>=arr.length-1; i++)

    //next Smaller Right
    // while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {

    //next Smaller Left
    // for (int i=0; i>=arr.length-1; i++)
    // while (!s.isEmpty() && arr[s.peek()] >= arr[i])

}
