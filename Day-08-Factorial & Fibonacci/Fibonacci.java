import java.util.Scanner;

public class Fibonacci {

  // Recursive method to find nth Fibonacci number
  static int fibonacci(int n) {

    // Base Case
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    // Recursive Case
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of terms: ");
    int terms = sc.nextInt();

    if (terms < 0) {
      System.out.println("Please enter a positive number.");
    } else {
      System.out.println("Fibonacci Series:");

      for (int i = 0; i < terms; i++) {
        System.out.print(fibonacci(i) + " ");
      }
    }

    sc.close();
  }
}
