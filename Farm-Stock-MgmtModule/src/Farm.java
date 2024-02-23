// Farm.java
import java.util.ArrayList;
import java.util.List;

public class Farm {
    private String name;
    private List<InventoryItem> inventory;

    public Farm(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public void addInventoryItem(InventoryItem item) {
        inventory.add(item);
    }

    public void displayInventory() {
        System.out.println("Inventory of " + name + ":");
        for (InventoryItem item : inventory) {
            System.out.println(item.getName() + ": " + item.getQuantity());
        }
    }
}
