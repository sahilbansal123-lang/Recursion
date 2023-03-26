package recursion;

import java.util.HashSet;

public class RecursionHardProblems {
//----------------------------------------------------------------------------------------------------------------------
//      Q1: Tower of Hanoi;
//      Time complexity: O(2^n)
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
//----------------------------------------------------------------------------------------------------------------------
//        Q2: Print String in reverse
//            Time Complexity: O(n)


    public static void reverseString(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx) + " ");
        reverseString(str, idx-1);

    }
//----------------------------------------------------------------------------------------------------------------------
//       Q3: Find the first and last occurrence of an element in a string
//           Time complexity: O(n)

    public static int first = -1;
    public static int last = -1;
    public static void firstAndlast(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentChar = str.charAt(idx);
        if(currentChar == element){
            if(first == -1){
                first = idx;
            } else {
                last = idx;
            }
        }
        firstAndlast(str, idx+1, element);
    }
//----------------------------------------------------------------------------------------------------------------------
//    Q4: Check if an array is Sorted or not
//      Time complexity: O(n)

    public static boolean isSorted(int arr[], int idx) {

       // base case
        if(idx == arr.length-1){
            return true;
        }
//        if (arr[idx] < arr[idx + 1]){
//            // array is sorted till now
//            return isSorted(arr, idx+1);
//        } else {
//            return false;
//        }

//                    OR

        if (arr[idx] >= arr[idx + 1]){
            // array is Unsorted
            return false;
        } else {
            return isSorted(arr, idx+1);
        }
    }

//----------------------------------------------------------------------------------------------------------------------

//    Q5: Move all x to the end
//          Time Complexity: O(n)

    public static void movEnd(String str, int count, String newString, int idx){
        if(idx == str.length()){
            for (int i = 0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            movEnd(str, count, newString, idx+1);
        } else {
            newString += currChar;
            movEnd(str, count, newString, idx+1);
        }
    }
//    ------------------------------------------------------------------------------------------------------------------

//    Q6: Print all the subsequences of the string
//        Time Complexity: O(2^n)

    public static void subSequences(String str, int idx, String newStr){

        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(idx);

        // to be
        subSequences(str, idx+1, newStr+currentChar);
        // not to be
        subSequences(str, idx + 1, newStr);
    }

//  --------------------------------------------------------------------------------------------------------------------

//     Q7: Remove all duplicates form the string
//         Time complexity: O(n)


    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, String newStr, int idx){

        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicates(str, newStr, idx+1);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, newStr, idx+1);
        }
    }

//    ------------------------------------------------------------------------------------------------------------------

//    Q8: Print all unique subSequence of the string
//        Time Complexity:

    public static void uniqueSubSeq(String str, String newStr, int idx, HashSet<String>set){
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currentChar = str.charAt(idx);

        // to be
        uniqueSubSeq(str, newStr+currentChar, idx+1, set);
        // not to be
        uniqueSubSeq(str, newStr, idx + 1, set);
    }

//    ------------------------------------------------------------------------------------------------------------------

//    Q9: Print keypad Combinations
//        Time Complexity: O(4^n)

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void keypadCombinations(String number, int idx, String Combinations) {

        if(idx == number.length()){
            System.out.println(Combinations);
            return;
        }

        char currChar = number.charAt(idx);
        String keyAlphabets = keypad[currChar - '0'];
        for (int i = 0; i < keyAlphabets.length(); i++){
            keypadCombinations(number, idx + 1, Combinations + keyAlphabets.charAt(i));
        }

    }

    public static void main(String[] args) {

        String number = "235";
//        HashSet <String> set = new HashSet<>();
        keypadCombinations(number, 0, "");
    }
}
