import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z,multi;
        System.out.print("Enter three number: ");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        multi=x*y*z;
        System.out.println("Multiplication of given number is: "+multi);
    }
}