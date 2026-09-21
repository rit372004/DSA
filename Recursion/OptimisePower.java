package Recursion;

public class OptimisePower {
    public static int optimisePower (int a, int n) {
        if (n == 0) {
            return 1;
        }

        //n is even
        int halfPower = optimisePower(a, n);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {

        System.out.println(optimisePower(2, 10));
        
    }
}