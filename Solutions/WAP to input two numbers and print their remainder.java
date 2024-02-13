import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividend,divisor,remainder;
        System.out.print("Enter two number: ");
        dividend = input.nextInt();
        divisor = input.nextInt();
        remainder = dividend % divisor;
        System.out.println("Remainder is: "+remainder);
    }
}