import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
public class DataAnalysisProgram {
   private static final Logger logger = Logger.getLogger(DataAnalysisProgram.class.getName());
   public static void main(String[] args) {
      DataAnalysisMethods methods = new DataAnalysisMethods();
      Scanner sc = new Scanner(System.in);
      List<Driver> drivers = new ArrayList<>();
      Boolean loop = false;
      System.out.println("Welcome to the FIA Formula 1 Data Analysis Program!");
      do {
         System.out.println("What would you like to do?");
         System.out.println("1. Read a csv file");
         System.out.println("2. Print List of Drivers?");
         System.out.println("3. Sort drivers based on their fastest lap times");
         System.out.println("4. Find Teams based on car code");
         System.out.println("5. Exit the program"); 
         int options = sc.nextInt();
         sc.nextLine();
         switch (options) {
            case 1:
               methods.readFile(sc, drivers);
               break;
            case 2:
               methods.sortDriversByLap(drivers);
               
               break;
            case 3:
               System.out.println("Printing Drivers");
               methods.printArray(drivers);
               break;
            case 4:
               System.out.println("Enter a car code");
               String carCode = sc.nextLine();
               methods.findTeamsFromDriver(drivers, carCode);
               break;
            case 5:
               System.out.println("Exiting program");
               loop = true;
            default:
               System.out.println("Enter a correct value");
               break;
         }
      } while(!loop);
   } 
}
