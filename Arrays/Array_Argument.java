public class Array_Argument {

    public static void byValue(int nonchangeable) {
        nonchangeable = 10;    
    }

    public static void byRefrence(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {

        int marks[] = { 97, 89, 67 };
        byRefrence(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        
        int nonchangeable = 5;
        byValue(nonchangeable);
        System.out.println(nonchangeable);

    }
}
