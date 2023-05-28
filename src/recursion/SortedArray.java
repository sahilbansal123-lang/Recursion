package recursion;
public class SortedArray {

    public static boolean sortedArray(int i, int arr[]) {

        if (i == arr.length - 1){
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortedArray(i + 1, arr);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        System.out.println(sortedArray(0, arr));
    }
}
