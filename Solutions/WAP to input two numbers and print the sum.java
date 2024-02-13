import java.util.Scanner;
class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter two number: ");
        a = input.nextInt();
        b = input.nextInt();
        c = a + b;
        System.out.println("Addition is: "+c);
    }
}
