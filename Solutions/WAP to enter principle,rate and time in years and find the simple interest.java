import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p,r,t,si;
        System.err.print("Enter Principle Amount: ");
        p = input.nextFloat();
        System.out.print("Enter Rate: ");
        r = input.nextFloat();
        System.out.print("Enter Time: ");
        t = input.nextFloat();
        si = p*r*t;
        System.out.println("Simple Interest is: "+si);
    }
}