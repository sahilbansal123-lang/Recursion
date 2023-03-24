public class Recursion {
//        PreRequisites:
//            Iterations/Loops
//            Functions

//        Recursion: it is a type of method in which a function calls itself
//                   continuously till the base condition hits

                        // call
                        // work
                        // Base Case


//    Q1:   Print Numbers from 5 to 1 using recursion.

    public static void printNumbers(int n){
        // base case
        if(n == 0) {
            return;
        }
        // print
        System.out.println(n);
        // recursion
        printNumbers(n-1);
    }

//    Q2:   Print Numbers from 1 to 5 using recursion.

    public static void printNumber(int n) {
        if (n == 6){
            return;
        }
        System.out.println(n);
        printNumbers(n+1);
    }

//    Q3: print sum of first n natural numbers

    public static void sumNumbers(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        sumNumbers(i+1, n, sum);
    }

//    Q4: Print factorial of a first n natural numbers

    public static int factorialSum(int n){
        if(n == 1 || n == 0 ){
           return 1;
        }

        int fact_nm1 = factorialSum(n-1); // call
        int fact_n = n * fact_nm1; // work
        return fact_n;
    }

//    Q5: print fibbonacci series

    public static void fibonacciSeries(int a, int b, int n) {

        if(n == 0){
            return;
        }

        int c = a + b;
        System.out.println(c);
        fibonacciSeries(b, c, n-1);
    }

//    Q6: Calculate x^n recursively (Stack height = log(n))

    public static int exponents(int x, int n){

        if (x == 0 ){
            return 0;
        }
        if (n == 0){
            return 1;
        }

        if(n % 2 == 0){
            return exponents(x, n/2) * exponents(x,n/2);
        }
        else {
            return exponents(x, n/2) * exponents(x, n/2) * x;
        }
    }

//    Q7: Calculate x^n recursively (Stack height = n)

    public static int exponent(int x, int n){

        if (x == 0 ){
            return 0;
        }
        if (n == 0){
            return 1;
        }

        int xPownm1 = exponent(x, n/2);
        int xPown = x * xPownm1;
        return xPown;
    }


    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int ans = exponents(x, n);
        System.out.println(ans);
    }
}