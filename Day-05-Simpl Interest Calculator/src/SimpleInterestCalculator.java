import java.util.Scanner;

public class SimpleInterestCalculator {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("===== Simple Interest Calculator =====");

    // Taking user input
    System.out.print("Enter Principal Amount: ");
    double principal = sc.nextDouble();

    System.out.print("Enter Rate of Interest: ");
    double rate = sc.nextDouble();

    System.out.print("Enter Time (in years): ");
    double time = sc.nextDouble();

    // Applying formula
    double simpleInterest = (principal * rate * time) / 100;

    // Calculating total amount
    double totalAmount = principal + simpleInterest;

    // Displaying result
    System.out.println("\n----- Result -----");
    System.out.println("Simple Interest = " + simpleInterest);
    System.out.println("Total Amount = " + totalAmount);

    sc.close();
  }
}
