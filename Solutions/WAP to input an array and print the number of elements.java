import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          int i,n=0;
          int a[] = new int[5]; //declaration
          System.out.println("Enter an Array: ");
          for(i=0;i<5;i++) {
               a[i] = ob.nextInt();
          }
          // Number of element
          System.out.println("--- Array ---");
          for(i=0;i<5;i++) {
               System.out.println(a[i]+"\t");
               n++;
          }
          System.out.println("Number of Elements is: "+n);
     }
}