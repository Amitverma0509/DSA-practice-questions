// OUTPUT:=
//     REPORT
// *************
// (1)Maths     =
// (2)English   =
// (3)Hindi     =
// (4)Computer  =
// (5)G.K.      =
//   Average    =
// *************

import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float maths,english,hindi,computer,gk,average;
        System.out.print("Enter marks of Maths: ");
        maths = input.nextFloat();
        System.out.print("Enter marks of English: ");
        english = input.nextFloat();
        System.out.print("Enter marks of Hindi: ");
        hindi = input.nextFloat();
        System.out.print("Enter marks of Computer: ");
        computer = input.nextFloat();
        System.out.print("Enter marks of G.K.: ");
        gk = input.nextFloat();
        average = (maths+english+hindi+computer+gk)/5;
        System.out.println("     REPORT");
        System.out.println("***************");
        System.out.println("(1)Maths    = "+maths);
        System.out.println("(2)English  = "+english);
        System.out.println("(3)Hindi    = "+hindi);
        System.out.println("(4)Computer = "+computer);
        System.out.println("(5)G.K.     = "+gk);
        System.out.println("  Average"+average);
        System.out.println("****************");

    }
}
