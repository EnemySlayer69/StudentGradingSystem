import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int[] marks;
    int totalMarks;
    double percentage;
    char grade;

    Student(String name, int rollNumber, int numberOfSubjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new int[numberOfSubjects];
    }

    void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    void calculateTotalAndPercentage() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        percentage = (double) totalMarks / marks.length;
    }

    void assignGrade() {
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void displayResults() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        Student student = new Student(name, rollNumber, numberOfSubjects);

        student.inputMarks();
        student.calculateTotalAndPercentage();
        student.assignGrade();
        student.displayResults();
    }
}
