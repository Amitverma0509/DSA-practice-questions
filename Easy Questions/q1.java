// WAP to input Array
import java.util.Scanner;
            class Main{
                public static void main(String[] args) {
                    Scanner ob = new Scanner(System.in);
                    int a[] = new int[5];
                    System.out.print("Enter Array: ");
                    for(int i=0;i<5;i++) {
                        a[i] = ob.nextInt();
                    }
                    System.out.println("--- Array ---");
                    for(int i=0;i<5;i++) {
                        System.out.print(a[i]+"\t");
                    }
                }
            }