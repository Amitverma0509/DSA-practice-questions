import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,average;
        System.out.print("Enter four number to get it's average: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        average = (a+b+c+d)/4;
        System.out.println("Average is: "+average);
    }
}