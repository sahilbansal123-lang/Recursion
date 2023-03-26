package recursion;

import java.util.ArrayList;

public class RecursionAdvanceProblem {

//----------------------------------------------------------------------------------------------------------------------

//    Q1: Print all the possible permutations of the string
//        Time Complexity: O(n!)

    public static void permutations(String str, String Combinations){

        if (str.length() == 0) {
            System.out.println(Combinations);
            return;
        }

//        abc
//        i = a so store a in currChar
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutations(newStr, Combinations + currChar);
        }
    }

//----------------------------------------------------------------------------------------------------------------------

//    Q2: Count total path in the maze to move from (0, 0) to (n, m)
//        Conditions = 1.move right 2.move downward
//        Time complexity:

    public static int totalPaths(int i, int j, int n, int m) {

        if ( i == n || j == m){
            return 0;
        }
        if(i == n - 1 && j == m - 1){
            return 1;
        }

        // downward movement
        int DownPath = totalPaths(i + 1, j, n, m);
        // right movement
        int rightPath = totalPaths(i, j + 1, n, m);
        return DownPath + rightPath;
        }

//----------------------------------------------------------------------------------------------------------------------
//    Q3: Place tiles of 1 x m in a floor of n x m
//        Time complexity:
    public static int totalWays (int n, int m) {

        if (n < m) {
            return 1;
        }
        if (n == m){
            return 2;
        }

        // vertical placement of a tile
        int verticalPlace = totalWays(n  - m, m);
        // horizontal placement of tiles
        int horizontalPlace = totalWays(n - 1, m);
        return verticalPlace + horizontalPlace;

    }

//    ------------------------------------------------------------------------------------------------------------------

//    Q4: find the number of ways in which youcan invite n people in your party , single or in pairs
//        Time complexity:

    public static int invitationWays(int n){

        if(n <= 1){
            return 1;
        }
        // single call
        int single = invitationWays(n - 1);
        // pair call
        int pair = (n - 1) * invitationWays(n - 2);
        return single + pair;
    }

//    ------------------------------------------------------------------------------------------------------------------
//    Q5: Print all subset of set of first n natural numbers
//        Time complexity:
    private static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++){
            System.out.print(  subset.get(i) + " " );
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){

        if(n == 0){
            printSubset(subset);
            return;
        }

        // add hoga
        subset.add(n);
        findSubsets(n-1, subset);

        // add nhi hua to
        subset.remove(subset.size() - 1);
        findSubsets(n-1, subset);

    }



    public static void main(String[] args) {


        int n = 4;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
