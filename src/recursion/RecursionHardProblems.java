package recursion;

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


    public static void main(String[] args) {

        String str = "axxxbbcdbxxab";
        movEnd(str, 0, "", 0);
    }
}
