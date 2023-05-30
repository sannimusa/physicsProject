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
    public static void potentialEnergy() {
        Scanner scan = new Scanner(System.in);

        //mass input
        int mass = scan.nextInt();
        //gravity
        int gravity = scan.nextInt();
        //height input
        int height = scan.nextInt();
        //potential energy formula
        int potentialEnergy = mass * gravity * height;
        System.out.println(potentialEnergy);
    }
    public static void power() {
        //read input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter work");
        int work = scan.nextInt();
        System.out.println("Enter work");
        int time = scan.nextInt();

        double pow = work * time;
        System.out.println("Power is " + pow + "Watts");
    }

    public static float getGravity() {
        return Gravity;
    }

    public void setGravity(float Gravity) {
        this.Gravity = Gravity;
    }

    private static float Gravity = 10;
}

