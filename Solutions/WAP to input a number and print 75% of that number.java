import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,percent;
        System.out.print("Enter number: ");
        n = input.nextDouble();
        percent = 0.75*n;
        System.out.println("75% of "+n+" is: "+percent);
    }
}