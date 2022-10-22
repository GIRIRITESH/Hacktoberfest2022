//Aditya Mali
//22-10-2022
//Binary Search using Java


import java.util.*;

public class Binary_Search
{
   public static void main(String args[])
   {
      int i , n , s , k=0;
      int a[];  
      int low , mid , high ;
      
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter number of elements: ");
      n = sc.nextInt(); 

      
      a = new int[n];

      System.out.println("Enter " + n + " integers in Ascending Order: ");

      for (i = 0; i < n; i++)
      {
          a[i] = sc.nextInt();
      }

      System.out.println("Enter the no. you want to search :");
      s = sc.nextInt();

      low = 0;
      high = n - 1;
      mid = (low + high)/2;

      while(low <= high)
      {
         if (a[mid] < s)
         {
           low = mid + 1;
         }

         else if (a[mid] == s)
         {
           System.out.println(s + " found at position " + (mid + 1));
           k=1;
           break;
         }

         else
         {
            high = mid - 1;
         }

         mid = (low + high)/2;

      }

        if(k==0)
        {
            System.out.println("Number not found in Array");
        }
   }
}