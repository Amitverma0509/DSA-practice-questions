import java.util.Scanner;
class Solution {
     public static void main(String[] args) {
          Scanner ob = new Scanner(System.in);
          
          System.out.print("Enter a character: ");
          char ch = ob.next().charAt(0);

          if(ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               System.out.println(ch+" is a vowel.");
          }
          else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <='Z')) {
               System.out.println(ch+" is a constant.");
          } else {
               System.out.println("Not a valid alphabet.");
          }
     }
}