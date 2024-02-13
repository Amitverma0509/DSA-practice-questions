import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Enter Two Numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        if (a > b) {
            System.out.println(a+" is Larger than "+b);
        }
        else {
            System.out.println(b+" is Larger than "+a);
        }
    }
}