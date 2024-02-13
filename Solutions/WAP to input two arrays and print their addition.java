import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          int i;
          int a[] = new int[5];
          int b[] = new int[5];
          int c[] = new int[5];
          System.out.println("Enter First Array: ");
          for(i=0;i<5;i++) {
               a[i] = ob.nextInt();
          }
          System.out.println("Enter Second Array: ");
          for(i=0;i<5;i++) {
               b[i] = ob.nextInt();
          }
          System.out.println("--- First Array ---");
          for(i=0;i<5;i++) {
               System.out.println(a[i]+"\t");
          }
          System.out.println("--- Second Array ---");
          for(i=0;i<5;i++) {
               System.out.println(b[i]+"\t");
          }
          // Addition of two array
          for(i=0;i<5;i++) {
               c[i] = a[i]+b[i];
          }
          System.out.println("--- Addition Array ---");
          for(i=0;i<5;i++) {
               System.out.println(c[i]+"\t");
          }
     }
}