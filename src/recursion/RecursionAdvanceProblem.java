package recursion;

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

    public static void totalPaths() {

    }
    public static void main(String[] args) {
        String str = "abcd";
        permutations(str, "");

    }
}
