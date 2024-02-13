import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          int a[] = new int[5]; // declaration
          System.out.print("Enter an array: ");
          for(int i=0;i<5;i++) {
               a[i] = ob.nextInt();
          }
          System.out.println("---Array---");
          for(int i=0;i<5;i++) {
               System.out.println(a[i]+"\t");
          }
     }
}