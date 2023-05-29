import java.util.Scanner;

public class Physics {
    public static void KineticEnergy() {
        Scanner scan = new Scanner(System.in);

        //mass input
        System.out.println("Mass:");
        int mass = scan.nextInt();
        //velocity input
        System.out.println("Velocity");
        //kinetic energy formula
        int velocity = scan.nextInt();
        double kineticEnergy = 0.5 * mass * (velocity*velocity);
        //displaying answer
        System.out.println(kineticEnergy);
    }
