import java.util.Scanner;

public class Lamson {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        System.out.print("Triangle Label (ex: ABC)? ");

        while (loop) {

            String label = input.nextLine();

            System.out.print("\nSide 1? ");
            double side1 = input.nextDouble();
            if (side1 <= 0) {
                System.out.print("Invalid Side Length. Re-enter: ");
                side1 = input.nextDouble();
            }

            System.out.print("\nSide 2? ");
            double side2 = input.nextDouble();
            if (side2 <= 0) {
                System.out.print("Invalid Side Length. Re-enter: ");
                side2 = input.nextDouble();
            }

            System.out.print("\nSide 3? ");
            double side3 = input.nextDouble();
            if (side3 <= 0) {
                System.out.print("Invalid Side Length. Re-enter: ");
                side3 = input.nextDouble();
            }

            if (side1 == side2 && side2 == side3) {
                System.out.print("\nTriangle " + label + " is equilateral");
                loop = false;
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.print("\nTriangle " + label + " is isosceles");
                loop = false;
            } else if (side1 + side2 < side3) {
                System.out.print("\nERROR. Invalid Triangle! Re-enter the sides: ");
            } else {
                System.out.print("\nTriangle " + label + " is scalene");
                loop = false;
            }
        }
    }
}
