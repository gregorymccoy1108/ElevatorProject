import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Elevator {
    private List<Tenant> tenants;
    private int maxFloor;

    public Elevator(int maxFloor) {
        this.maxFloor = maxFloor;
        this.tenants = new ArrayList<>();
    }

    public void addTenant(Tenant tenantToAdd) {
        if (tenants.contains(tenantToAdd)) {
            System.out.println("This person is already in the system.");
        }else {
            tenants.add(tenantToAdd);
        }
    }

    public void removeTenant(String tenantName) {
        tenants.remove(returnTenant(tenantName));
        System.out.printf("%s has been removed from the system", tenantName);
    }

    public boolean checkForTenant(String newTenant) {
        if(tenants.isEmpty()) return false;
        for(Tenant personToCheck : tenants) {
            if (personToCheck.getName().toLowerCase().equals(newTenant.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public Tenant returnTenant(String tenantName) {
        if (checkForTenant(tenantName)) {
            for(Tenant tenantCheck : tenants) {
                if (tenantCheck.getName().toLowerCase().equals(tenantName.toLowerCase())) return tenantCheck;
            }
        } else {
            System.out.println("This tenant is not in the system.");
        }
        return null;
    }
}
