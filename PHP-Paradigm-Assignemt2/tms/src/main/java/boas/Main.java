package boas;

public class Main {
    public static void main(String[] args) {
        int numStudents = 3; // Default number of students
        int numSubjects = 5; // Default number of subjects

        // Default grades for demonstration purposes
        double[][] grades = {
            {85, 90, 88, 92, 87},
            {78, 82, 80, 85, 79},
            {92, 95, 90, 87, 94}
        };

        System.out.println("Welcome to Grade Book System");

        // Displaying grades
        System.out.println("\nGrades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.println("\tSubject " + (j + 1) + ": " + grades[i][j]);
            }
        }

        // Calculating and displaying average grade for each student
        System.out.println("\nAverage Grades:");
        for (int i = 0; i < numStudents; i++) {
            double totalGrade = 0;
            for (int j = 0; j < numSubjects; j++) {
                totalGrade += grades[i][j];
            }
            double avgGrade = totalGrade / numSubjects;
            System.out.println("Student " + (i + 1) + ": " + avgGrade);
        }
    }
}