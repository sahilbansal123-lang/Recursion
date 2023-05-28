package recursion;

public class PowerOfX {

    public static int powerOfX(int x, int n){
        if (n == 0) {
            return 1;
        }
        int power = x * powerOfX(x, n-1);
        return power;
    }

    // OPTIMIZED Time Complexity O(logN)

    public static int powerOfXOptimized(int x, int n){
        if (n == 0) {
            return 1;
        }
        int halfPowerSq = powerOfXOptimized(x, n/2) * powerOfXOptimized(x, n/2);
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(powerOfX(2, 5));
        System.out.println(powerOfXOptimized(2, 5));
    }
}
