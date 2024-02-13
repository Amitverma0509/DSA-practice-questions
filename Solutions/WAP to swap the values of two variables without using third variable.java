class Solution {
    public static void main(String[] args) {
         int a=5,b=6;
         System.out.println("Before Swapping");
         System.out.println("a = "+a);
         System.out.println("b = "+b);

         // Swapping without using a third variable
         a = a + b;
         b = a - b;
         a = a - b;

         System.out.println("\nAfter swapping: ");
         System.out.println("a = "+a);
         System.out.println("b = "+b);
    }
}