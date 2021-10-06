// Jaskirat kaur
//A00219135
//JAV1001 -001 lab 2 -Arrays and Methods
import java.util.Scanner;

public class ArrayTools
{

  public static void main(String[] args)
  {

    Scanner cin = new Scanner(System.in);
    //To find the encrypted string using caesar cipher method.
    System.out.println(" Enter the  text you want to encrypt: "   );
    String plaintext = cin.nextLine();
    System.out.println("Enter the shift :" );
    int shift = cin.nextInt();
    System.out.println("cipher:" +encrypt(plaintext, shift));

    //To find the average of the numbers given in the arrays.
    int myarray[]  = {32, 56, 68, 98};
    int n = myarray.length;
    System.out.println(average(myarray, n));

    //To search a value in a given array

    System.out.println("Enter the value you want to find in the given array:");
    int search_value = cin.nextInt();
    if(searchvalue(myarray,search_value,n ))
    System.out.println(search_value + "value exists");
    else
    System.out.println("value doesnot exists:" + search_value);

    //To Reverse an array

    reverseArr(myarray, n);
   }


   public static StringBuffer encrypt(String plaintext, int shift )
   {
     StringBuffer result = new StringBuffer();
     for(int index=0; index<plaintext.length(); ++index)
     {
       char ch = (char) (((int)plaintext.charAt(index)+ shift)%26);//used En(x)=(x+n)mod26 for encryption
       result.append(ch);
     }
     return result;
   }

   public static double average(int myarray[], int n)
   {
     int sum =0;
     for(int i=0; i<n; ++i)
       {
       sum = sum + myarray[i];
       }
     System.out.println("sum of the given array :" + sum);
     double average = sum/ n;
     System.out.println("Average of the given array  :" + average);
     return average;
    }


   public static boolean searchvalue( int[]myarray, int search_value , int n )
   {
   for(int i =0; i<n; ++i)
    {
     if(myarray[i]==search_value)

       return true;
     }
     return false;
    }


    public static void reverseArr(int[] x, int n )
    {
      int[] c = new int[n];
      int y = n;
      for(int i=0; i<n; ++i)
      {
        c[y-1] = x[i];
        y=y-1;
      }
      System.out.println("the reversed array is:\n");
          for (int m=0; m<n; ++m)
          {
          System.out.println(c[m]);
          }
       }
 }
