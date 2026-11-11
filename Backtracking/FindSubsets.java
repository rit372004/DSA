package Backtracking;

public class FindSubsets {
    public static void findsubsets(String str, String ans, int i) {
        //base case 
        if (i == str.length()) {
           if(ans.length() == 0) {
            System.out.println("null");
           } else {
            System.out.println(ans);
           }
           return ;
        }
        //recursion
        //Yes Choice 
        findsubsets(str, ans+str.charAt(i), i+1);
        //No Choice
        findsubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findsubsets(str, "", 0);

    }
}