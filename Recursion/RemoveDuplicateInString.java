package Recursion;

public class RemoveDuplicateInString {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        //Base Case
        if (idx == str.length()) {
            System.out.println(newStr);
            return ;
        }
        //Kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) { //duplicate not add
            removeDuplicate(str, idx+1, newStr, map);
        }
        else { //add bcz not present in map
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        removeDuplicate(str, 0,  new StringBuilder(""), new boolean[26]);
        
    }
}
