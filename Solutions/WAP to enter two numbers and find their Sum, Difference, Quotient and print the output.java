import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,sum,diff;
        float quotient;
        System.out.print("Enter two number: ");
        a = input.nextInt();
        b = input.nextInt();
        sum = a + b;
        diff = a - b;
        quotient = (float) a / b;
        System.out.println("Addition is: "+sum);
        System.out.println("Subtraction is: "+diff);
        System.out.println("Quotient is: "+quotient);
    }
}