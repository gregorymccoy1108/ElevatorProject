import java.util.Scanner;

public class Main {

    private static Scanner keyboard = new Scanner(System.in);
    private static Elevator theElementTampa = new Elevator(30);

    public static void main(String[] args) {
	    /*
	        This will be a test application that will replicate an elevator in a condo. It will add tenants and check
	        if they have access to a floor before trying to go to that floor.
	     */
        int input = 0;

        while(true) {
            showMenu();
            input = keyboard.nextInt();
            switch(input) {
                case 1:
                    addTenant();
                    break;
                case 2:
                    removeTenant();
                    break;
                case 3:
                    goToFloor();
                    break;
                case 4:
                    exitMenu();
                    return;
            }
        }

    }

    public static void showMenu() {
        System.out.println("********************************");
        System.out.println("Welcome to the elevator menu!" );
        System.out.println("Please select from the following menu: ");
        System.out.println("1) Add a new tenant to the system");
        System.out.println("2) Delete a tenant from the system");
        System.out.println("3) Allow a tenant to select a floor");
        System.out.println("4) Exit the menu");
        System.out.print("Input: ");
    }

    public static void addTenant() {
        keyboard.nextLine();
        System.out.print("What is the name of the new Tenant: ");
        String name = keyboard.nextLine();
        if(theElementTampa.checkForTenant(name)) {
            System.out.println("This tenant is already in the system");
        }else {
            System.out.print("What is the unit number: ");
            int unitNumber = keyboard.nextInt();
            System.out.print("What floor is the unit on: ");
            int floor = keyboard.nextInt();
            System.out.print("What is the rent for this unit: ");
            int rentAmount = keyboard.nextInt();
            theElementTampa.addTenant(new Tenant(name, unitNumber, rentAmount, floor));
        }

    }

    public static void removeTenant() {

    }

    public static void goToFloor() {
        keyboard.nextLine();
        System.out.print("What is the name of the tenant: ");
        String name = keyboard.nextLine();
        if(theElementTampa.checkForTenant(name)) {
            System.out.print("What floor would you like to go to: ");
            int floorToGo = keyboard.nextInt();
            if(theElementTampa.returnTenant(name).haveFloorAccess(floorToGo)) {
                System.out.printf("%s is now on floor %s\n", name, floorToGo);
            }else {
                System.out.println("You do not have access to go to that floor");
            }
        }else {
            System.out.println("This tenant is not in the system. Please check the spelling (case sensitive)");
        }
    }

    public static void exitMenu() {
        System.out.println("****************************************************");
        System.out.println("Thank you for using the elevator management system!");
        System.out.println("****************************************************");
    }

}
