import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          int i,j;
          int a[][] = new int[2][2];
          int b[][] = new int[2][2];
          int c[][] = new int[2][2];
          System.out.println("Enter First 2x2 Matrix: ");
          for(i=0;i<2;i++) {
               for(j=0;j<2;j++) {
                    a[i][j] = ob.nextInt();
               }
          }
          System.out.println("Enter Second 2x2 Matrix: ");
          for(i=0;i<2;i++) {
               for(j=0;j<2;j++) {
                    b[i][j] = ob.nextInt();
               }
          }
          System.out.println("--- First Matrix ---");
          for(i=0;i<2;i++) {
               for(j=0;j<2;j++) {
                    System.out.print(a[i][j]+"\t");
               }
               System.out.println();
          }
          System.out.println("--- Second Matrix ---");
          for(i=0;i<2;i++) {
               for(j=0;j<2;j++) {
                    System.out.print(b[i][j]+"\t");
               }
               System.out.println();
          }
          // Addition 
          for(i=0;i<2;i++) {
               for(j=0;j<2;j++) {
                    c[i][j] = a[i][j]+b[i][j];
               }
          }
          System.out.println("Addition of two matrix is: ");
          for(i=0;i<2;i++) {
               for(j=0;j<2;j++) {
                    System.out.print(c[i][j]+"\t");
               }
               System.out.println();
          }
     }
}