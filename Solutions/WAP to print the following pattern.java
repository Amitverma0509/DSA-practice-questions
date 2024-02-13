import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Enter word to make pattern: ");
        name = input.nextLine();
        System.out.println(name);
        System.out.println("    "+name);
        System.out.println("        "+name);
        System.out.println("            "+name);
    }
}