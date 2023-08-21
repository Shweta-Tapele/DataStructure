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
    public static void main(String[] args)
    {
       int result = sumOfDigits(arr.length-1);
        System.out.println(result);
    }

}
