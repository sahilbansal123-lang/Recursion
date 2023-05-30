package recursion;

public class BinaryString {

    public static void printBinaryString(int n, String str, int lastPlace){

        if (n == 0) {
            System.out.println(str);
            return;
        }

        if (lastPlace == 1){
            printBinaryString(n-1, str+"0", 0);
        } else {
            printBinaryString(n-1, str+"0", 0);
            printBinaryString(n-1, str+"1", 1);
        }
    }

    public static void main(String[] args) {
        printBinaryString(3, "", 0);
    }
}
