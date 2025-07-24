import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataAnalysisProgram {
   private static final Logger logger = Logger.getLogger(DataAnalysisProgram.class.getName());
   public static void main(String[] args) {
      DataAnalysisMethods methods = new DataAnalysisMethods();
      Scanner sc = new Scanner(System.in);
      List<Driver> drivers = new ArrayList<>();
      System.out.println("Welcome to the FIA Formula 1 Data Analysis Program!");
      System.out.println("Enter the name of your file");
      String fileName = sc.nextLine();
      methods.readFile(fileName, drivers);

      System.out.println("Here are the contents of the file");
      methods.printArray(drivers);
      
      System.out.println("Would you like to sort the drivers based on their fastest lap times");
      String choice = sc.nextLine().toUpperCase();
      
      System.out.println("Test");
      if (choice.equals("Y")) {
         logger.log(Level.INFO,"Finished sorting");
         methods.sortDriversByLap(drivers);
         System.out.println("This is what the sorted list looks like");
         methods.printArray(drivers);
      }
      sc.nextLine();
   } 
}
