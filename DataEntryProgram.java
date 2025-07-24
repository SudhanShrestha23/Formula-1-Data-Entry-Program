import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class DataEntryProgram {
    
    //TODO: Work on looping menu with try-catch block
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        DataEntryMethods dataEntryMethods = new DataEntryMethods();
        List<Driver> drivers = new ArrayList<>();
        boolean correctInput;
        
        System.out.println("\nWelcome to the FIA Formula 1 Data Entry Program");
        do {
            System.out.println("What program would you like to select");
            System.out.println("1. Add Driver Entries");
            System.out.println("2. Display Data");
            System.out.println("3. Write file");
            System.out.println("4. Exit");
            try {
                correctInput = true;
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
                        System.out.println("This is what the data looks like:");
                        dataEntryMethods.printArray(drivers);
                        
                        System.out.println("Would you like add more drivers? Y or N");
                        String decision = sc.nextLine();
                        if (decision.toUpperCase().equals("Y")) {
                                System.out.println("How many drivers would you like to add data for");
                                int driverNums = sc.nextInt();
                                sc.nextLine();
                                for (int i = 0; i < driverNums; i++) {
                                    drivers.add(dataEntryMethods.createDriver(sc));
                                }
                        }
                        break;
                    case 2:
                        System.out.println("This is what the data looks like:");
                        dataEntryMethods.printArray(drivers);
                        break;
                    case 3:
                        System.out.println("What would you like to name your file?");
                        String fileName = sc.nextLine();
                        dataEntryMethods.writeFile(fileName, drivers);
                        break;
                    case 4:
                        correctInput = false;
                        break;
                    default:
                        System.out.println("Pick a valid input");
                        
                    }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input try again: " + e);
                correctInput = false;
            }
        } while (correctInput);
        System.out.println("End of the program");
    }
}