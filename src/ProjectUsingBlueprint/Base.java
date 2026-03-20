import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String choice = "y";
        Vehicle[] vehicles = new Vehicle[10];
        int count = 0;

        while (choice.equalsIgnoreCase("y")) {

            Vehicle v1 = new Vehicle();

            System.out.print("Enter Vehicle Brand: ");
            v1.brand = scan.next();

            System.out.print("Enter Vehicle Engine Number: ");
            v1.enCa = scan.nextInt();

            System.out.print("Enter Vehicle Chacy Number: ");
            v1.chNo = scan.next();

            System.out.print("Enter Vehicle Color: ");
            v1.colo = scan.next();

            System.out.print("Enter Vehicle Year: ");
            v1.year = scan.nextInt();

            vehicles[count] = v1;
            count++;

            System.out.print("Do you want to add another vehicle? (y/n): ");
            choice = scan.next();
        }

        enginAbove1500(vehicles, count);
    }

    public static void enginAbove1500(Vehicle[] vehicles, int count) {

        for (int i = 0; i < count; i++) {
            if (vehicles[i].enCa > 1500) {

                System.out.println("-----------------------------------------");
                System.out.println("Brand: " + vehicles[i].brand);
                System.out.println("Engine No: " + vehicles[i].enCa);
                System.out.println("Chacy No: " + vehicles[i].chNo);
                System.out.println("Color: " + vehicles[i].colo);
                System.out.println("Year: " + vehicles[i].year);
            }else {
                System.out.println("No Vehicle Above 1500!");
            }
        }
    }
}