import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean correctInput = true;
    System.out.println("Welcome to the FIA Formula 1 Data Program");
    System.out.println("Select an Option");
    int choice = 0;
    do {
      try {
        System.out.println("test");
        System.out.println("1. Data Entry Program");
        System.out.println("2. Data Retrival Program");
        choice = sc.nextInt();
        switch (choice) {
          case 1:
            DataEntryProgram.main(args);
            break;
          case 2:
            DataAnalysisProgram.main(args);
            break;
          case 3:
            System.out.println("Exiting Program have a nice day!");
            break;
          default:
            System.out.println("Incorrect value detected");
        }
        sc.close();
      } catch (InputMismatchException e) {
          System.out.println("Enter a valid number");
          correctInput = false;
        }
    } while (choice !=3);
    System.out.println("Outside the loop");
  }
}
