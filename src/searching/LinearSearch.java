package searching;

public class LinearSearch {


     int linearSearch(int[] arr, int elem)
     {
         for(int i =0; i< arr.length;i++)
         {
             if(arr[i] == elem)
             {
                 return i;
             }
             else
             {
                 System.err.print("element not found");
             }
         }
     }










}
