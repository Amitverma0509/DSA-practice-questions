/* HRA = 20% of salary
DA = 15% of salary
PF = 10% of salary
>> OUTPUT:-
Salary =
HRA =
DA =
PF =
Net Salary =
Salary in hand =
*/

import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary;
        System.out.print("Enter Your Salary: ");
        salary = input.nextDouble();
        double HRA = 0.20*salary;
        double DA = 0.15*salary;
        double PF = 0.10*salary;
        double netSalary = salary + HRA + DA - PF;
        double salaryInHand = netSalary - PF;
        System.out.println("Salary = "+salary);
        System.out.println("HRA = "+HRA);
        System.out.println("DA = "+DA);
        System.out.println("PF = "+PF);
        System.out.println("Net Salary = "+netSalary);
        System.out.println("Salary in hand = "+salaryInHand);
    }
}