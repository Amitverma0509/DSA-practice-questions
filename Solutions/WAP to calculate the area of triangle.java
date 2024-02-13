import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height , area;
        System.out.print("Enter base of triangle: ");
        base = input.nextDouble();
        System.out.print("Enter height of triangle: ");
        height = input.nextDouble();
        area = 0.5*base*height;
        System.out.println("Area of triangle is: "+area);
    }
}