package recursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n > 0) {
            // Move n-1 disks from source to auxiliary rod
            towerOfHanoi(n - 1, source, auxiliary, destination);

            // Move the nth disk from source to destination rod
            System.out.println("Move disk " + n + " from " + source + " to " + destination);

            // Move the n-1 disks from auxiliary to destination rod
            towerOfHanoi(n - 1, auxiliary, destination, source);
        }
    }


    public static void main(String[] args) {
        int n = 3; // Number of disks
        char source = 'A';
        char destination = 'C';
        char auxiliary = 'B';

        // Call the function to solve the Tower of Hanoi puzzle
        towerOfHanoi(n, source, destination, auxiliary);
    }
}
