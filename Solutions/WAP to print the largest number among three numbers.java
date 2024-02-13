import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int a,b,c;
          System.out.print("Enter three numbers: ");
          a = input.nextInt();
          b = input.nextInt();
          c = input.nextInt();
          if(a > b) {
               if(a > c) {
                    System.out.println(a+" is largest among "+a+" , "+b+" & "+c);
               }
               else {
                    System.out.println(c+" is largest among "+a+" , "+b+" & "+c);
               }
          }
          else {
               if(b > c) {
                    System.out.println(b+" is largest among "+a+" , "+b+" & "+c);
               }
               else {
                    System.out.println(c+" is largest among "+a+" , "+b+" & "+c);
               }
          }
     }
}