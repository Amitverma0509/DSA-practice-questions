import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name,myClass,city;
        System.out.print("Enter Your name: ");
        name = input.nextLine();
        System.out.print("Class: ");
        myClass = input.nextLine();
        System.out.print("Where do you live: ");
        city = input.nextLine();
        System.out.println("Name is: "+name);
        System.out.println("Class is: "+myClass);
        System.out.println("City: "+city);
    }
}