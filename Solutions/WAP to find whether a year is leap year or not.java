import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          System.out.print("Enter a year: ");
          int year = ob.nextInt();

          if(((year%4==0) && (year%100!=0)) || (year%400==0)) {
               System.out.println("Specified year is a leap year");
          } else {
               System.out.println("Specified year is not a leap year");
          }

     }
}