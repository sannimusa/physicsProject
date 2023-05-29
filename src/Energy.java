import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Energy{
    JFrame mainFrame = new JFrame("Physics Calculator");

    //FRAME FOR KINETIC ENERGY
    JFrame KineticEnergyFrame = new JFrame("Kinetic Energy");
    JButton KineticEnergyButton = new JButton("KineticEnergyButton");
    JLabel mass = new JLabel("enter Mass for Kinetic Energy");
    JTextField massInput = new JTextField(15);
    JLabel velocity = new JLabel("enter Velocity for Kinetic Energy");
    JTextField velocityInput = new JTextField(15);
    JButton calculateKe = new JButton("Calculate KINETIC ENERGY");

    //FRAME FOR POTENTIAL ENERGY
    JFrame PotentialEnergyFrame = new JFrame("Kinetic Energy");
    JButton PotentialEnergyButton = new JButton("PotentialEnergyButton");
    JLabel PotentialEnergyMass = new JLabel("enter Mass for Potential Energy");
    JTextField PotentialEnergyMassInput = new JTextField(15);
    JLabel PotentialEnergyHeight = new JLabel("enter Height for Potential Energy");
    JTextField PotentialEnergyHeightInput = new JTextField(15);
    JButton calculatePe = new JButton("Calculate POTENTIAL ENERGY");

    //FRAME FOR POWER
    JFrame PowerFrame = new JFrame("Power Frame");
    JButton PowerButton = new JButton("Power");
    JLabel PowerWork = new JLabel("enter work for Power");
    JTextField PowerWorkInput = new JTextField(15);
    JLabel PowerTime = new JLabel("enter work for Power");
    JTextField PowerTimeInput = new JTextField(15);
    JButton calculatePower = new JButton("Calculate POWER");

    //FRAME FOR FORCE
    JFrame ForceFrame = new JFrame("Force Frame");
    JButton ForceButton = new JButton("Force");
    JLabel ForceMass = new JLabel("enter mass for FORCE");
    JTextField ForceMassInput = new JTextField(15);
    JLabel ForceAcceleration = new JLabel("enter work for Power");
    JTextField ForceAccelerationInput = new JTextField(15);
    JButton calculateForce = new JButton("Calculate FORCE");

    //FRAME FOR WEIGHT
    JFrame WeightFrame = new JFrame("Weight Frame");
    JButton WeightButton = new JButton("Weight");
    JLabel WeightMass = new JLabel("enter MASS");
    JTextField WeightMassInput = new JTextField(15);
    JButton calculateWeight = new JButton("Calculate WEIGHT");

    public void mainUi() {
        mainFrame.add(KineticEnergyButton);
        mainFrame.add(PotentialEnergyButton);
        mainFrame.add(PowerButton);
        mainFrame.add(ForceButton);
        mainFrame.add(WeightButton);
        mainFrame.setSize(500, 500);
        mainFrame.setLayout(new GridLayout(5,1));
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // KINETIC ENERGY FRAME
        KineticEnergyButton.addActionListener(e -> {
            System.out.println("Calculate Kinetic Energy");
            JOptionPane.showMessageDialog(null, "Calculate Kinetic Energy");
            drawKineticEnergyUI();
        });
        // POTENTIAL ENERGY FRAME
        PotentialEnergyButton.addActionListener(e -> {
            System.out.println("Calculate Potential Energy");
            JOptionPane.showMessageDialog(null, "Calculate Potential Energy");
            drawPotentialEnergyUI();
        });
        PowerButton.addActionListener(e -> {
            System.out.println("Calculate Power");
            JOptionPane.showMessageDialog(null, "Calculate Power");
            drawPower();
        });
        ForceButton.addActionListener(e -> {
            System.out.println("Calculate Force");
            JOptionPane.showMessageDialog(null, "Calculate Force");
            drawForce();
        });
        WeightButton.addActionListener(e -> {
            System.out.println("Calculate Weight");
            JOptionPane.showMessageDialog(null, "Calculate Weight");
            drawWeight();
        });


        // PARAMETER (ATTRIBUTES)
        calculateKe.addActionListener(e -> {
            try {
                double Mass = Double.parseDouble(massInput.getText());
                double Velocity = Double.parseDouble(velocityInput.getText());
                double KineticEnergy = (Mass * pow(Velocity, 2)) / 2;
                JOptionPane.showMessageDialog(null, " Kinetic Energy = " + KineticEnergy);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pls Input a Valid Number");

            }
        });
        // POTENTIAL ENERGY
        calculatePe.addActionListener(e -> {
            try {
                double Mass = Double.parseDouble(PotentialEnergyMassInput.getText());
                double Height = Double.parseDouble(PotentialEnergyHeightInput.getText());
                double PotentialEnergy = Mass * Physics.getGravity() * Height;
                JOptionPane.showMessageDialog(null, " Potential Energy = " + PotentialEnergy);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pls Input a Valid Number");

            }
        });
        // POWER
        calculatePower.addActionListener(e -> {
            try{
                double work = Double.parseDouble(PowerWorkInput.getText());
                double time = Double.parseDouble(PowerTimeInput.getText());
                double PotentialEnergy = work * time;
                JOptionPane.showMessageDialog(null, " Potential Energy = " + PotentialEnergy);
            }catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pls Input a Valid Number");
            }

        });

    }
    public void drawKineticEnergyUI() {
        KineticEnergyFrame = new JFrame("Kinetic Energy");
        KineticEnergyFrame.add(mass);
        KineticEnergyFrame.add(massInput);
        KineticEnergyFrame.add(velocity);
        KineticEnergyFrame.add(velocityInput);
        KineticEnergyFrame.add(calculateKe);
        KineticEnergyFrame.setLayout(new GridLayout(3,2));
        KineticEnergyFrame.setSize(500, 400);
        KineticEnergyFrame.setVisible(true);

    }
    public void drawPotentialEnergyUI() {
        PotentialEnergyFrame = new JFrame("Potential Energy");
        PotentialEnergyFrame.add(PotentialEnergyMass);
        PotentialEnergyFrame.add(PotentialEnergyMassInput);
        PotentialEnergyFrame.add(PotentialEnergyHeight);
        PotentialEnergyFrame.add(PotentialEnergyHeightInput);
        PotentialEnergyFrame.add(calculatePe);
        PotentialEnergyFrame.setLayout(new GridLayout(3,2));
        PotentialEnergyFrame.setSize(500, 400);
        PotentialEnergyFrame.setVisible(true);
        PotentialEnergyFrame.add(PotentialEnergyMass);
    }
     public void drawPower() {
        PowerFrame = new JFrame("Power");
        PowerFrame.add(PowerWork);
        PowerFrame.add(PowerWorkInput);
        PowerFrame.add(PowerTime);
        PowerFrame.add(PowerTimeInput);
        PowerFrame.add(calculatePower);
        PowerFrame.setLayout(new GridLayout(3,2));
        PowerFrame.setSize(500, 400);
        PowerFrame.setVisible(true);
    }
    public void drawForce() {
        ForceFrame = new JFrame("Force");
        ForceFrame.add(ForceMass);
        ForceFrame.add(ForceMassInput);
        ForceFrame.add(ForceAcceleration);
        ForceFrame.add(ForceAccelerationInput);
        ForceFrame.add(calculatePower);
        ForceFrame.setLayout(new GridLayout(3,2));
        ForceFrame.setSize(500, 400);
        ForceFrame.setVisible(true);
