import java.util.Scanner;
class Solution {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        double r,area;
        System.out.println("Enter radius of circle: ");
        r = ob.nextDouble();
        area = 3.14159 * r * r;
        System.out.println("Area of circle is: "+area);
    }
}
