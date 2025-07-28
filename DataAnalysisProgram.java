import java.util.*;
import java.util.logging.Logger;

public class DataAnalysisProgram {
   private static final Logger logger = Logger.getLogger(DataAnalysisProgram.class.getName());
   public static void main(String[] args) {
      DataAnalysisMethods methods = new DataAnalysisMethods();
      Scanner sc = new Scanner(System.in);
      List<Driver> drivers = new ArrayList<>();
      System.out.println("Welcome to the FIA Formula 1 Data Analysis Program!");
      System.out.println("What would you like to do?");
      System.out.println("1. Read a csv file");
      System.out.println("2. Sort drivers based on their fastest lap times");
      System.out.println("3. Find Teams based on car code");
      System.out.println("Enter the name of your file");

      int options = sc.nextInt();
      sc.nextLine();
      switch (options) {
         case 1:
            methods.readFile(sc, drivers);
            System.out.println("Here are the contents of the file");
            methods.printArray(drivers);
            break;
         case 2:
            methods.sortDriversByLap(drivers);
            System.out.println("This is what the sorted list looks like");
            methods.printArray(drivers);
            break;
         case 3:
            System.out.println("Enter a car code");
            String carCode = sc.nextLine();
            methods.findTeamsFromDriver(drivers, carCode);
            break;
         default:
            break;
      }
      
     
      
  
   } 
}
