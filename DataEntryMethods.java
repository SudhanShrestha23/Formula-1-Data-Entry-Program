import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DataEntryMethods {
    
    public Driver createDriver(Scanner sc) {
        System.out.println("Enter a name for a Driver");
        String name = sc.nextLine();
        System.out.println("Enter a Team");
        String team = sc.nextLine();
        System.out.println("Enter a car code");
        String carCode = sc.nextLine();
        System.out.println("Enter a Grand Prix");
        String grandPrix = sc.nextLine();
        System.out.println("Enter Driver's position (-1 for DNF)");
        int posFinished = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Driver's Fastest Lap");
        float fastestLap = sc.nextFloat();
        sc.nextLine();
        return new Driver(name,team,carCode,grandPrix,posFinished,fastestLap);
    }

    public void writeFile(String fileName, List<Driver> drivers) {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(fileName));
            for (Driver driver: drivers) {
                br.write(driver.csvFormat() + "\n");
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error with handelling file: " + e);
        }
    }

    public void printArray(List<Driver> drivers) {
        System.out.println("Driver \tTeam \tGrand-Prix \tPosition-Finished \tFastest-Lap");
        for (Driver driver: drivers) {
            driver.toString();
        }
    }
}
