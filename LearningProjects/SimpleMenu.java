package LearningProjects;

import java.util.Scanner;

/*
   Do while example of simple menu
 */
public class SimpleMenu {
    public static void main(String[] args) {
        System.out.println("A sample Menu card Using do while:");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select your choice 1 to 7:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Choice of Dosa(Onion/Ghee/Podi");
                    break;
                case 2:
                    System.out.println("Idly wiht Sambar / Chutney");
                    break;
                case 3:
                    System.out.println("Choice of Eggs to Order");
                    break;
                case 4:
                    System.out.println("Naatu Kozhi Sukka varuval");
                    break;
                case 5:
                    System.out.println("Mutton Egg varuval");
                    break;
                case 6:
                    System.out.println("Southern Fried Chicken");
                    break;
                case 7:
                    System.out.println("Sandwich(Veg/Non-Veg/Club)");
                    break;
                default:
                    System.out.println("Seasonal Fresh Juice)");
            }
        } while (choice > 7);

    }
}
