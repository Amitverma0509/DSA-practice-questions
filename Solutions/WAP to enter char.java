import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character: ");
        ch = input.next().charAt(0);
        System.out.println("Character is: "+ch);
    }
}