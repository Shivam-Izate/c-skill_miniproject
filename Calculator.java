// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

class Calculator {
   Calculator() {
   }

   public static int calculate(int var0, int var1, String var2) {
      switch (var2) {
         case "+":
            return var0 + var1;
         case "-":
            return var0 - var1;
         case "*":
            return var0 * var1;
         case "/":
            if (var1 != 0) {
               return var0 / var1;
            }

            throw new ArithmeticException("Division by zero is not allowed.");
         default:
            throw new IllegalArgumentException("Invalid operator: " + var2);
      }
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter first number: ");
      int var2 = var1.nextInt();
      System.out.print("Enter second number: ");
      int var3 = var1.nextInt();
      System.out.print("Enter operator (+, -, *, /): ");
      String var4 = var1.next();

      try {
         int var5 = calculate(var2, var3, var4);
         System.out.println("Result: " + var5);
      } catch (IllegalArgumentException | ArithmeticException var9) {
         System.out.println(((RuntimeException)var9).getMessage());
      } finally {
         var1.close();
      }

   }
}
