class Solution {
     public static void main(String[] args) {
          int a = 5, b = 6,swap;
          System.out.println("Before Swapping");
          System.out.println("a = "+a);
          System.out.println("b = "+b);

          swap = a;
          a = b;
          b = swap;
          System.out.println("\nAfter swapping: ");
          System.out.println("a = "+a);
          System.out.println("b = "+b);
     }
}