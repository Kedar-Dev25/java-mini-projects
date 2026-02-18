import java.util.Scanner;

public class NumberSorting {

  // 🔹 Method to perform Bubble Sort
  public static void sortArray(int[] arr) {

    int n = arr.length;

    // Outer loop for passes
    for (int i = 0; i < n - 1; i++) {

      boolean isSwapped = false; // Optimization check

      // Inner loop for comparison
      for (int j = 0; j < n - 1 - i; j++) {

        if (arr[j] > arr[j + 1]) {

          // 🔁 Swapping logic
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

          isSwapped = true;
        }
      }

      // If no swapping happens → array already sorted
      if (!isSwapped) {
        break;
      }
    }
  }

  // 🔹 Method to print array
  public static void printArray(int[] arr) {

    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of elements: ");
    int size = sc.nextInt();

    int[] numbers = new int[size];

    // 📥 Taking array input
    System.out.println("Enter " + size + " numbers:");

    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }

    System.out.println("\nOriginal Array:");
    printArray(numbers);

    // 🔹 Sorting the array
    sortArray(numbers);

    System.out.println("\nSorted Array (Ascending Order):");
    printArray(numbers);

    sc.close();
  }
}
