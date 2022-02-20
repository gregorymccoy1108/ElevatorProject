import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private List<FloorLevel> floors;
    private int currentLevel;

    public Elevator() {
        this.floors = new ArrayList<>();
    }

    public void addFloorPlan(FloorLevel newFloor) {
        floors.add(newFloor);
        System.out.printf("You have added floor #%s to the elevators levels\n", newFloor.getFloorLevel());
    }

    public void changeLevel(FloorLevel newLevel) {
        if (floors.contains(newLevel)) {
            System.out.printf("You have travelled to level #%s", newLevel.getFloorLevel());
        }else {
            System.out.println("This level does not exist. Please input a correct level to travel to.");
        }
    }
}
