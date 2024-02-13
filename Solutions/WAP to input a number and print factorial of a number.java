import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int n = ob.nextInt();
          int fact = 1;
          for(int i=1; i<=n;i++) {
               fact = fact * i;
          }
          System.out.println(fact);
     }
}