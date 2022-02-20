import java.util.HashMap;
import java.util.Map;

public class Tenant {
    private String name;
    private int unitNumber;
    private int rentAmount;
    private int floor;
    private Map<Integer, Boolean> floorAccess = new HashMap<>();

    public Tenant(String name, int unitNumber, int rentAmount, int floor) {
        this.name = name;
        this.unitNumber = unitNumber;
        this.rentAmount = rentAmount;
        this.floor = floor;

        floorAccess.put(floor, true);
    }

    public void getRentAmount() {
        System.out.printf("The cost of rent for %s is $%s per month", name, rentAmount);
    }

    public String getName() {
        return name;
    }

    public boolean haveFloorAccess(int floorToCheck) {
        if (floorAccess.containsKey(floorToCheck)) return true;
        return false;
    }
}
