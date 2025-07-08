import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DataEntryProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        DataEntryMethods dataEntryMethods = new DataEntryMethods();
        List<Driver> drivers = new ArrayList<>();

        while (choice == 4) {

            System.out.println("Welcome to the FIA Formula 1 Data Entry Program");
            System.out.println("What would you like to do");
            System.out.println("1. Add Driver Entries");
            System.out.println("2. Write file");
            System.out.println("3. Add more data");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                System.out.println("How many drivers would you like to add data for");
                int driverNum = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < driverNum; i++) {
                    drivers.add(dataEntryMethods.createDriver(sc));
                }
                break;
                case 2:
                break;
                case 3:
                break;
                default:
            }
            sc.close();
        }
    }
}
