import java.util.HashMap;
import java.util.Map;

public class FloorLevel {

    private Map<Integer, String> level = new HashMap<>();
    int floorLevel;
    String description;

    public FloorLevel(Integer level, String description) {
        this.level.put(level, description);
        this.floorLevel = level;
        this.description = description;
    }

    public void getDescriptionOfLevel() {
        System.out.println(level.get(floorLevel));
    }

    public int getFloorLevel() {
        return floorLevel;
    }
}
