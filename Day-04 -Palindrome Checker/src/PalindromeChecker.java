import java.util.Scanner;

public class PalindromeChecker {

  // Method to check palindrome for numbers
  public static boolean isNumberPalindrome(int number) {
    int originalNumber = number;
    int reversedNumber = 0;

    while (number > 0) {
      int digit = number % 10;
      reversedNumber = (reversedNumber * 10) + digit;
      number = number / 10;
    }

    return originalNumber == reversedNumber;
  }

  // Method to check palindrome for strings
  public static boolean isStringPalindrome(String text) {
    String reversedText = "";

    for (int i = text.length() - 1; i >= 0; i--) {
      reversedText = reversedText + text.charAt(i);
    }

    return text.equalsIgnoreCase(reversedText);
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Number Palindrome Check
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    if (isNumberPalindrome(number)) {
      System.out.println(number + " is a Palindrome number.");
    } else {
      System.out.println(number + " is NOT a Palindrome number.");
    }

    // String Palindrome Check
    scanner.nextLine(); // Consume newline
    System.out.print("\nEnter a string: ");
    String text = scanner.nextLine();

    if (isStringPalindrome(text)) {
      System.out.println("\"" + text + "\" is a Palindrome string.");
    } else {
      System.out.println("\"" + text + "\" is NOT a Palindrome string.");
    }

    scanner.close();
  }
}
