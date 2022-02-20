import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Elevator {
    private Map<Integer, String> floors;

    public Elevator() {
        this.floors = new HashMap<>();
    }

    public void addFloorPlan(Integer newFloor, String description) {
        if (floors.containsKey(newFloor)) {
            System.out.printf("This floor is already in the system: %s\n", newFloor);
        }else {
            floors.put(newFloor, description);
            System.out.printf("You have added level #%s to the floorplan\n", newFloor);
        }
    }

}
