package LearningProjects;

import java.util.Scanner;

/*
    Validate a password based on certain criteria.
 */
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password Requirements:");
        System.out.println("- At least 8 characters long");
        System.out.println("- Contains at least one uppercase letter");
        System.out.println("- Contains at least one digit");

        System.out.print("Enter your password: ");
        String pwd = scanner.nextLine();

        boolean hasUpper = false;
        boolean hasDigit = false;

        if(pwd.length() >=8){
            for (char c : pwd.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpper = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }

            if (hasUpper && hasDigit) {
                System.out.println("Password is valid!");
            } else {
                System.out.println("Password is invalid!");
                if (!hasUpper) {
                    System.out.println("- Missing uppercase letter");
                }
                if (!hasDigit) {
                    System.out.println("- Missing digit");
                }
            }
        } else {
            System.out.println("Password is too short! Must be at least 8 characters.");
        }
    }
}