package recursion;

public class TilingProblem {

    public static int tilingFloor(int n){
        // base
        if (n == 0 || n == 1){
            return 1;
        }
        // work
        // vertical placing
        int fnm1 = tilingFloor(n-1);
        // horizontal placing
        int fnm2 = tilingFloor(n-2);
        // total ways
        int totWays = fnm1 + fnm2;

        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingFloor(4));
    }
}
