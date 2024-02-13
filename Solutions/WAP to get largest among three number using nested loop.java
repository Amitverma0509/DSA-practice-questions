import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z;
        System.out.print("Enter three numbers: ");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        if (x > y) {
            if (x > z) {
                System.out.println(x+" is largest among "+x+" , "+y+" & "+z);
            }
            else {
                System.out.println(z+" is largest among "+x+" , "+y+" & "+z);
            }
        }
        else {
            if (y > z) {
                System.out.println(y+" is largest among "+x+" , "+y+" & "+z);
            }
            else {
                System.out.println(z+" is largest among "+x+" , "+y+" & "+z);
            }
        }
    }
}