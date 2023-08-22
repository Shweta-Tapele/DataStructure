//program to print the sum of digits of array


package recursion;

public class Recursion1 {
    static int[] arr = { 12,3,5,3,6};

    public  static int sumOfDigits(int n)
    {
        if (n == 0)
            return arr[n];
        return arr[n] + sumOfDigits(n-1);
    }
    public  static int fact(int n)
    {
        if( n == 1)
            return n;
        return n * fact(n-1);
    }

    public static void main(String[] args)
    {
       int result = sumOfDigits(arr.length-1);
        System.out.println(result);
        int fact_result = fact(5);
        System.out.println(fact_result);
        int fib_result = fib(6);
        System.out.println(fib_result);
    }

    private static int fib(int i) {
        if ( i == 1 || i == 0)
        {
            return i;
        }
        else
        {
            return fib(i-1)+fib(i-2);
        }

    }

}
