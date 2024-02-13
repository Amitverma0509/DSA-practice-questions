import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int a,b;
          System.out.print("Enter two numbers: ");
          a = input.nextInt();
          b = input.nextInt();
          if (a > b) {
               System.out.println(a+" is largest than "+b);
          }
          else {
               System.out.println(b+" is largest than "+a);

          }
     }
}