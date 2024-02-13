import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          System.out.print("Enter Your Age: ");
          int Age = ob.nextInt();

          if(Age>=18) {
               System.out.println("You are eligible to vote.");
          } else {
               System.out.println("You are not eligible to vote.");
          }
     }
}