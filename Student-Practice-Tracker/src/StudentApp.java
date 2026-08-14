
import java.util.Scanner;

class Student1 {

    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    void setDetails(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Course Name : " + courseName);
    }

    void displayProgress() {
        System.out.println("Completed Topics : " + completedTopics);
        System.out.println("Questions Solved : " + questionsSolved);
    }

    void addTopics(int newTopics) {
        completedTopics = completedTopics + newTopics;
    }

    void addQuestions(int newQuestions) {
        questionsSolved = questionsSolved + newQuestions;
    }
}

public class StudentApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("     STUDENT PRACTICE TRACKER");
        System.out.println("==============================");

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Completed Topics: ");
        int completedTopics = scanner.nextInt();

        System.out.print("Enter Questions Solved: ");
        int questionsSolved = scanner.nextInt();

        Student1 student = new Student1();

        student.setDetails(name, courseName);
        student.setProgress(completedTopics, questionsSolved);

        int choice = 0;

        while (choice != 5) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("            MENU");
            System.out.println("==============================");
            System.out.println("1. View Student Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Completed Topics");
            System.out.println("4. Add Solved Questions");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {

                student.displayDetails();

            } else if (choice == 2) {

                student.displayProgress();

            } else if (choice == 3) {

                System.out.print("Enter New Completed Topics: ");
                int newTopics = scanner.nextInt();

                student.addTopics(newTopics);

                System.out.println("Topics updated successfully.");
                System.out.println("Total Completed Topics: "
                        + student.completedTopics);

            } else if (choice == 4) {

                System.out.print("Enter New Questions Solved: ");
                int newQuestions = scanner.nextInt();

                student.addQuestions(newQuestions);

                System.out.println("Questions updated successfully.");
                System.out.println("Total Questions Solved: "
                        + student.questionsSolved);

            } else if (choice == 5) {

                System.out.println("Thank you for using Student Practice Tracker.");
                System.out.println("Keep Practicing!");

            } else {

                System.out.println("Invalid choice.");
                System.out.println("Please enter a value between 1 and 5.");
            }
        }

        scanner.close();
    }
}
