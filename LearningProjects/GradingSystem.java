package LearningProjects;

import java.util.Scanner;

/*
  A small Java project focused up to control structures
  (like if, switch, for, while, etc.) I hope It's support for strengthen logic skills.

   Concept:
    1.Build a command-line program that takes marks for 3-5 subjects, calculates:
    2.Total marks
    3.Percentage
    4.Grade (A, B, C, D, F)
    5.Pass/Fail status

   Features:
    1.Input student name and marks for each subject.
    2.Check for invalid input (marks should be between 0-100).
    3.Use if-else or switch to assign grades.
    4.Loop to repeat for multiple students.
    5.Use of arrays or variables to store subject marks (if you've learned arrays).

 */
public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do{
            System.out.println("Enter a Your(Student) name:");
            String stdname = sc.nextLine();

            int total = 0;
            int subjects = 5;
            boolean valid = true;

            for(int i=1; i<=subjects;i++){
                System.out.println("Enter a Subject"+ i +" Mark:");
                int mark = sc.nextInt();;

                if(mark<0 || mark>100){
                    System.out.println("Entered Invalid value! Please check it once again!");
                    valid = false;
                    break;
                }
                total += mark;
            }
            if (valid){
                float avg = total /(float)subjects;
                String grade;

                if (avg >= 90) grade = "A";
                else if (avg >= 80) grade = "B";
                else if (avg >= 70) grade = "C";
                else if (avg >= 60) grade = "D";
                else grade = "F";

                System.out.println("\n--- Report ---");
                System.out.println("Name: " + stdname);
                System.out.println("Total: " + total);
                System.out.println("Percentage: " + avg + "%");
                System.out.println("Grade: " + grade);
                System.out.println(avg >= 40 ? "Status: Pass" : "Status: Fail");
            }

            System.out.print("\nDo you want to enter another student? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using the grading system!");
    }
}