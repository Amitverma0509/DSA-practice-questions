import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sqr;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        sqr = num * num;
        System.out.println("Square is: "+sqr);
    }
}