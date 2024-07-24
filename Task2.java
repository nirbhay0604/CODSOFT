import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int numberOfSubjects = scanner.nextInt();
        int[] subjectMarks = new int[numberOfSubjects];
        
        // Input from user
        for(int i = 0; i < numberOfSubjects; i++){
            System.out.println("Enter the marks of subject " + (i + 1) + ":");
            subjectMarks[i] = scanner.nextInt();
        }
        scanner.close();
        // Total marks
        int totalMarks = 0;
        for(int mark : subjectMarks){
            totalMarks += mark;
        }
        
        // Percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        
        // Grade
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
         
        // Result
        System.out.println("Result:");
        System.out.println("");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("");
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("");
        System.out.println("Grade Scored: " + grade);        
    }
}
