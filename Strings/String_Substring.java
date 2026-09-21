package Strings;

public class String_Substring {
    public static String subString(String str , int si, int ei) {
        String subStr = "";
        for (int i=si; i<ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        
        System.out.println(subString("HelloWorld", 0, 3 ));


        
    }
}
