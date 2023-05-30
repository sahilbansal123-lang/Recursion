package recursion;

public class FriendsPairing {

    public static int pairing(int n) {

        if (n == 1 || n == 2){
            return n;
        }

        // if a person is single so we have n-1 choices left
        int single = pairing(n-1);
        // if a person is ready to pair we have n-1 choices for selecting whom to pair and
        // n-2 choices for selecting whom we can pair with
        int pair = (n-1) * pairing(n-2);
        // total pairs
        int totWays = single + pair;

        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(pairing(4));
    }
}
