import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          int i,j;
          int a[][] = new int[2][2];
          System.out.println("Enter a matrix: ");
          for(i=0;i<2;i++) {
               for(j=0;j<2;j++) {
                    a[i][j] = ob.nextInt();
               }
          }
          System.out.println("--- Matrix --- ");
          for(i=0;i<2;i++) {
               for(j=0;j<2;j++) {
                    System.out.print(a[i][j]+"\t");
               }
               System.out.println();
          }
     }
}