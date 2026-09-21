package BitManipulation;

public class Set_Ith_Bit {

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2 ));   
    }
}
