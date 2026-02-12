import java.util.Scanner;

public class StudentGradeCalculator {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("===== Student Grade Calculator =====");

    System.out.print("Enter number of subjects: ");
    int numberOfSubjects = sc.nextInt();

    int[] marks = new int[numberOfSubjects];

    // Taking marks input
    for (int i = 0; i < numberOfSubjects; i++) {
      System.out.print("Enter marks for subject " + (i + 1) + ": ");
      marks[i] = sc.nextInt();
    }

    // Calculating total
    int total = 0;
    for (int i = 0; i < numberOfSubjects; i++) {
      total += marks[i];
    }

    // Calculating average
    double average = (double) total / numberOfSubjects;

    // Assigning grade
    String grade;

    if (average >= 90) {
      grade = "A";
    } else if (average >= 75) {
      grade = "B";
    } else if (average >= 50) {
      grade = "C";
    } else {
      grade = "Fail";
    }

    // Displaying results
    System.out.println("\n----- Result -----");
    System.out.println("Total Marks: " + total);
    System.out.println("Average Marks: " + average);
    System.out.println("Grade: " + grade);

    sc.close();
  }
}
