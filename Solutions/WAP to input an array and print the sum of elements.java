import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          int i,s=0;
          int a[] = new int[5];
          System.out.println("Enter an Array: ");
          for(i=0;i<5;i++) {
               a[i] = ob.nextInt();
          }
          System.out.println("--- ARRAY ---");
          for(i=0;i<5;i++) {
               System.out.println(a[i]+"\t");
          }
          // Sum of elements
          for(i=0;i<5;i++) {
               s = s + a[i];
          }
          System.out.println("Sum of Array is: "+s);
     }
}