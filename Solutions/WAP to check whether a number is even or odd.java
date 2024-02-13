import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int n = ob.nextInt();

          if(n%2==0) {
               System.out.println(n+" is even number.");
          } else {
               System.out.println(n+" is odd number.");
          }
     }
}