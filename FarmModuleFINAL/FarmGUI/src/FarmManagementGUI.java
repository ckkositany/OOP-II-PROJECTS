import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FarmManagementGUI extends JFrame implements ActionListener {
    private JButton addLivestockButton;
    private JButton removeLivestockButton;
    private JButton updateQuantityButton;
    private JButton displayLivestockButton;
    private JButton addHealthInfoButton;
    private JButton addBreedingInfoButton;
    private JButton addFeedingInfoButton;
    private JButton displayFeedingInfoButton;
    private JButton displayHealthInfoButton;
    private JButton displayBreedingInfoButton;

    private FarmManagement farmManagement;

    public FarmManagementGUI() {
        setTitle("Farm Management System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 1));

        addLivestockButton = new JButton("Add Livestock");
        removeLivestockButton = new JButton("Remove Livestock");
        updateQuantityButton = new JButton("Update Quantity");
        displayLivestockButton = new JButton("Display Livestock");
        addHealthInfoButton = new JButton("Add Health Information");
        addBreedingInfoButton = new JButton("Add Breeding Information");
        addFeedingInfoButton = new JButton("Add Feeding Information");
        displayFeedingInfoButton = new JButton("Display Feeding Information");
        displayHealthInfoButton = new JButton("Display Health Information");
        displayBreedingInfoButton = new JButton("Display Breeding Information");

        addLivestockButton.addActionListener(this);
        removeLivestockButton.addActionListener(this);
        updateQuantityButton.addActionListener(this);
        displayLivestockButton.addActionListener(this);
        addHealthInfoButton.addActionListener(this);
        addBreedingInfoButton.addActionListener(this);
        addFeedingInfoButton.addActionListener(this);
        displayFeedingInfoButton.addActionListener(this);
        displayHealthInfoButton.addActionListener(this);
        displayBreedingInfoButton.addActionListener(this);

        panel.add(addLivestockButton);
        panel.add(removeLivestockButton);
        panel.add(updateQuantityButton);
        panel.add(displayLivestockButton);
        panel.add(addHealthInfoButton);
        panel.add(addBreedingInfoButton);
        panel.add(addFeedingInfoButton);
        panel.add(displayFeedingInfoButton);
        panel.add(displayHealthInfoButton);
        panel.add(displayBreedingInfoButton);

        add(panel);
        setVisible(true);

        farmManagement = new FarmManagement(); // Initialize FarmManagement instance
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addLivestockButton) {
            String name = JOptionPane.showInputDialog(this, "Enter livestock name:");
            String quantityStr = JOptionPane.showInputDialog(this, "Enter quantity:");
            int quantity = Integer.parseInt(quantityStr);
            farmManagement.addLivestock(name, quantity);
            JOptionPane.showMessageDialog(this, "Livestock added successfully!");
        } else if (e.getSource() == removeLivestockButton) {
            String name = JOptionPane.showInputDialog(this, "Enter livestock name to remove:");
            farmManagement.removeLivestock(name);
            JOptionPane.showMessageDialog(this, "Livestock removed successfully!");
        } else if (e.getSource() == updateQuantityButton) {
            String name = JOptionPane.showInputDialog(this, "Enter livestock name to update quantity:");
            String newQuantityStr = JOptionPane.showInputDialog(this, "Enter new quantity:");
            int newQuantity = Integer.parseInt(newQuantityStr);
            farmManagement.updateLivestockQuantity(name, newQuantity);
            JOptionPane.showMessageDialog(this, "Quantity updated successfully!");
        } else if (e.getSource() == displayLivestockButton) {
            farmManagement.displayLivestock();
        } else if (e.getSource() == addFeedingInfoButton) {
            String name = JOptionPane.showInputDialog(this, "Enter animal name:");
            String feedingSchedule = JOptionPane.showInputDialog(this, "Enter feeding schedule:");
            farmManagement.addFeedingInformation(name, feedingSchedule);
            JOptionPane.showMessageDialog(this, "Feeding info added successfully!");
        } else if (e.getSource() == displayFeedingInfoButton) {
            farmManagement.displayFeedingInformation();
        } else if (e.getSource() == addHealthInfoButton) {
            String name = JOptionPane.showInputDialog(this, "Enter animal name:");
            String healthStatus = JOptionPane.showInputDialog(this, "Enter health status:");
            farmManagement.addHealthInformation(name, healthStatus);
            JOptionPane.showMessageDialog(this, "Health info added successfully!");
        } else if (e.getSource() == displayHealthInfoButton) {
            farmManagement.displayHealthInformation();
        } else if (e.getSource() == addBreedingInfoButton) {
            String name = JOptionPane.showInputDialog(this, "Enter animal name:");
            boolean isBreeding = JOptionPane.showConfirmDialog(this, "Is the animal breeding?") == JOptionPane.YES_OPTION;
            farmManagement.addBreedingInformation(name, isBreeding);
            JOptionPane.showMessageDialog(this, "Breeding info added successfully!");
        } else if (e.getSource() == displayBreedingInfoButton) {
            farmManagement.displayBreedingInformation();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FarmManagementGUI::new);
    }
}
