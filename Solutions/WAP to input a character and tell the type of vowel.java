import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);

          System.out.print("Enter a character: ");
          char ch = ob.next().charAt(0);

          if (ch == 'a' || ch == 'A') {
               System.out.println(ch+" is a Type 'A' vowel.");
          }
          else if(ch == 'e' || ch == 'E') {
               System.out.println(ch+" is a Type 'E' vowel.");
          }
          else if(ch == 'i' || ch == 'I') {
               System.out.println(ch+" is a Type 'I' vowel.");
          }
          else if(ch == 'o' || ch == 'O') {
               System.out.println(ch+" is a Type 'O' vowel.");
          }
          else if(ch == 'u' || ch == 'U') {
               System.out.println(ch+" is a Type 'U' vowel.");
          }
          else {
               System.out.println("Not a vowel");
          }
     }
}