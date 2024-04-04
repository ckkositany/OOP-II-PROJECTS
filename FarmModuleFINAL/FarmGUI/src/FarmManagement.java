import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FarmManagement {
    private List<Livestock> livestockList;
    private List<AnimalHealth> healthList;
    private List<BreedManagement> breedingList;
    List<FeedingManagement> feedingList = new ArrayList<>();

    private Scanner scanner;

    public FarmManagement() {
        livestockList = new ArrayList<>();
        healthList = new ArrayList<>();
        breedingList = new ArrayList<>();
        feedingList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Add methods for managing health, breeding, and feeding information similar to Livestock
    public void addHealthInformation(String name, String healthStatus) {
        AnimalHealth animalHealth = new AnimalHealth(name, healthStatus);
        healthList.add(animalHealth);
    }

    public void addBreedingInformation(String name, boolean isBreeding) {
        BreedManagement animalBreeding = new BreedManagement(name, isBreeding);
        breedingList.add(animalBreeding);
    }

    public void addFeedingInformation(String name, String feedingSchedule) {
        FeedingManagement animalFeeding = new FeedingManagement(name, feedingSchedule);
        feedingList.add(animalFeeding);
    }

    public void displayHealthInformation() {
        System.out.println("Health Information:");
        for (AnimalHealth health : healthList) {
            System.out.println(health.getName() + ": " + health.getHealthStatus());
        }
    }

    public void displayBreedingInformation() {
        System.out.println("Breeding Information:");
        for (BreedManagement breeding : breedingList) {
            System.out.println(breeding.getName() + ": " + (breeding.isBreeding() ? "Breeding" : "Not Breeding"));
        }
    }

    public void displayFeedingInformation() {
        System.out.println("Feeding Information:");
        for (FeedingManagement feeding : feedingList) {
            System.out.println(feeding.getName() + ": " + feeding.getFeedingSchedule());
        }
    }

    // Method to add livestock to the list
    public void addLivestock(String name, int quantity) {
        Livestock livestock = new Livestock(name, quantity);
        livestockList.add(livestock);
    }

    // Method to remove livestock from the list
    public void removeLivestock(String name) {
        livestockList.removeIf(livestock -> livestock.getName().equals(name));
    }

    // Method to update livestock quantity
    public void updateLivestockQuantity(String name, int newQuantity) {
        for (Livestock livestock : livestockList) {
            if (livestock.getName().equals(name)) {
                livestock.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("Livestock with name " + name + " not found.");
    }

    // Method to display all livestock
    public void displayLivestock() {
        System.out.println("Livestock Information:");
        for (Livestock livestock : livestockList) {
            System.out.println("Name: " + livestock.getName() + ", Quantity: " + livestock.getQuantity());
        }
    }

    public void interactivelyManageFarm() {
        int choice = 0;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Livestock");
            System.out.println("2. Remove Livestock");
            System.out.println("3. Update Livestock Quantity");
            System.out.println("4. Display Livestock");
            System.out.println("5. Add Health Information");
            System.out.println("6. Add Breeding Information");
            System.out.println("7. Add Feeding Information");
            System.out.println("8. Display Health Information");
            System.out.println("9. Display Breeding Information");
            System.out.println("10. Display Feeding Information");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Add Livestock
                    break;
                case 2:
                    // Remove Livestock
                    break;
                case 3:
                    // Update Livestock Quantity
                    break;
                case 4:
                    // Display Livestock
                    break;
                case 5:
                    // Add Health Information
                    break;
                case 6:
                    // Add Breeding Information
                    break;
                case 7:
                    // Add Feeding Information
                    break;
                case 8:
                    displayHealthInformation();
                    break;
                case 9:
                    displayBreedingInformation();
                    break;
                case 10:
                    displayFeedingInformation();
                    break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 11);
    }

    public static void main(String[] args) {
        FarmManagement farm = new FarmManagement();
        farm.interactivelyManageFarm();
    }
}
