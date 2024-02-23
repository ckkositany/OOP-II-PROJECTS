// Main.java
public class Main {
    public static void main(String[] args) {
        Farm myFarm = new Farm("My Farm");
        myFarm.addInventoryItem(new InventoryItem("Seeds", 100));
        myFarm.addInventoryItem(new InventoryItem("Fertilizers", 50));
        myFarm.addInventoryItem(new InventoryItem("Pesticides", 20));
        myFarm.displayInventory();
    }
}
