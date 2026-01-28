import java.util.Scanner;

public class elseiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        
        String grade;
        
        if (marks >= 90) {
            grade = "A";
            System.out.println("Excellent! You got Grade A");
        } else if (marks >= 80) {
            grade = "B";
            System.out.println("Very Good! You got Grade B");
        } else if (marks >= 70) {
            grade = "C";
            System.out.println("Good! You got Grade C");
        } else if (marks >= 60) {
            grade = "D";
            System.out.println("Passed! You got Grade D");
        } else if (marks >= 50) {
            grade = "E";
            System.out.println("Just Passed! You got Grade E");
        } else {
            grade = "F";
            System.out.println("Failed! You got Grade F");
        }
        
        System.out.println("Your marks: " + marks);
        System.out.println("Your grade: " + grade);
        
        scanner.close();
    }
}