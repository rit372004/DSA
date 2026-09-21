public class MSS_KadaneAlgo {
    public static void kadanes (int number[]) {

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i=0; i<number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms =  Math.max (ms, cs);
        }
        System.out.println("MaxSum = " + ms);

    }
    public static void main(String[] args) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(number);
        
    }
}
