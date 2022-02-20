import java.util.Scanner;

public class Main {

    private static Scanner keyboard = new Scanner(System.in);
    private static Elevator hamptonSouthTampa = new Elevator();

    public static void main(String[] args) {
	    /*
	        This will be a test application that will replicate an elevator. We will add levels and each level
	        will contain certain information and will be displayed once that level is travelled to.
	     */

        while(true) {
            showMenu();
            int selection = keyboard.nextInt();

            switch(selection) {
                case 1:
                    addFloorLevel();
                    break;
                case 2:
                    System.out.println("Delete a floor from the menu");
                    break;
                case 3:
                    System.out.println("Travel to a floor");
                    break;
                case 4:
                    System.out.println("Exiting the menu!");
                    return;
            }
        }
    }

    public static void showMenu() {
        System.out.println("********************************");
        System.out.println("Welcome to the elevator menu!" );
        System.out.println("Please select from the following menu: ");
        System.out.println("1) Create a new floor for the elevator");
        System.out.println("2) Delete a floor from the elevator");
        System.out.println("3) Travel to a floor");
        System.out.println("4) exit the menu");
        System.out.print("Input: ");
    }

    public static void addFloorLevel() {
        System.out.print("What is the level you would like to add?: ");
        int newLevel = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("What is a description of the new level: ");
        String description = keyboard.nextLine();
        hamptonSouthTampa.addFloorPlan(newLevel, description);
    }
}
