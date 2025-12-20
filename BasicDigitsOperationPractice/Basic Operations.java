/*import java.util.*;
//Print the unit digit of a number
public class BasicOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a%10);
    }
    
}
    */
/*
import java.util.*;
//Print the Tens digit of an number
public class BasicOperation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println((a/10)%10);
    }
}*/

/*
import java.util.*;
//Print the Hundreds digit of an number
public class BasicOperation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println((a/100)%10);
    }
}
*/
/*
import java.util.*;
//Print the Sum of Digits of a number
public class BasicOperation{
      public static void main(String args[]){  
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int sum=0;
          while(a>0){
            sum=a%10;
           a/=10;
         }
         System.out.println(sum);
   }
}*/
/*
import java.util.*;
//Print the product of digits
public class BasicOperation{
public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int product=1;
      while(a>0){
         int digit=a%10;
         product*=digit;
         a/=10;
      }
         System.out.println(product);
}} */



/*
import java.util.*;
//Reverse an Number
public class BasicOperation{
   public static void main(String args[]){
    Scannner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int rev=0;
    while(a>0){
         int digit=a%10;
         rev+=digit;
         a/=10;
        }
    System.out.println(rev);
} }*/

 /*
 import java.util.*;
 //Check if a number is palindrome
 public class BasicOperation{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int rev=0;
      int b=a;
      while(b>0){
        int digit=b%10;
        rev+=digit;
        b/=10;
      }
      System.out.println(a==rev);
 }}
     */

/*
import java.util.*;
//Count the No of Digits
public class BasicOperation{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        while(a>0){
            count++;
            a/=10;
        }
        System.out.println(count);

    }
} */

/*
import java.util.*;
//Find the largest digit in a number
public class BasicOperation{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int max=0;
     while(a>0){
        int digit=a%10;
        if(max<digit){
            max=digit;
        }
        a/=10;
     }
     System.out.println(max);
 }
} */

 /*
 import java.util.*;
//Find the Largest digit in a number
 public class BasicOperation{
    public static void main(String args[]){
       int a=sc.nextInt();
       int small=a%10;
       while(a>0){
         int digit=a%10;
        if(small<digit){
          small=digit;
        }
        a/=10;  
        }
        System.out.println(small);
   }
} */


