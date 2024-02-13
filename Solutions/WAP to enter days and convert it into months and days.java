import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days,month,day;
        System.out.print("Enter days: ");
        days = input.nextInt();
        month = days / 30;
        day = days % 30;
        System.out.println(month+" months "+day+" day");
    }
}