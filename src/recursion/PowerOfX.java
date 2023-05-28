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
        int power = x * powerOfX(x, n-1);
        return power;
    }

    public static void main(String[] args) {
        System.out.println(powerOfX(2, 20));
    }
}
