import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time,minute,second;
        System.out.print("Enter time in seconds: ");
        time = input.nextInt();
        minute = time / 60;
        second = time % 60;
        System.out.println("Time in minutes and seconds: "+minute+" minutes "+second+" seconds");
    }
}