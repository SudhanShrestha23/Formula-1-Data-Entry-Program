import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {
  private static final Logger logger = Logger.getLogger(Main.class.getName());
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean exitInput = true;
    System.out.println("Welcome to the FIA Formula 1 Data Program");
    System.out.println("Select an Option");
    int choice;
    do {
      try {
        System.out.println("test");
        System.out.println("1. Data Entry Program");
        System.out.println("2. Data Retrival Program");
        System.out.println("3. Exit the program");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
          case 1:
            DataEntryProgram.main(args);
            break;
          case 2:
            DataAnalysisProgram.main(args);
            logger.log(Level.INFO,"Finished with analysis program");
            break;
          case 3:
            System.out.println("Exiting Program have a nice day!");
            exitInput = false;
            break;
          default:
            System.out.println("Incorrect value detected");
        }
      } catch (InputMismatchException e) {
        System.out.println("Enter a valid number");
        exitInput = false;
      }
    } while (exitInput);
    System.out.println("Outside the loop");
    sc.close();
  }
}
