public class Main {

    public static void main(String[] args) {
	    /*
	        This will be a test application that will replicate an elevator. We will add levels and each level
	        will contain certain information and will be displayed once that level is travelled to.
	     */

        Elevator hamptonSouthTampa = new Elevator();

        FloorLevel thirteen = new FloorLevel(13, "This is where the ghost lives, no guests are allowed on this floor. NO EXCEPTIONS!!!");
        hamptonSouthTampa.addFloorPlan(thirteen);

        hamptonSouthTampa.changeLevel(thirteen);

    }
}
