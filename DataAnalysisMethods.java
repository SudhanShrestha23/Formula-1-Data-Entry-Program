import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
public class DataAnalysisMethods {
    public void readFile(String file, List<Driver> drivers) {
        try {
            String[] fileLine;
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            line = reader.readLine();

            while (line != null) {
                fileLine = line.split(",");
                line = reader.readLine();
                String driverName = fileLine[0].trim();
                String teamName = fileLine[1].trim();
                String carCode = fileLine[2].trim();
                String grandPrix = fileLine[3].trim();
                int posFinished = Integer.parseInt(fileLine[4]);
                float fastestLapTime = Float.parseFloat(fileLine[5]);
                drivers.add(new Driver(driverName,teamName,carCode,grandPrix,posFinished,fastestLapTime));                
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file: " + e);
        } catch (IOException e) {
            System.out.println("File has incorrect format");
        }
    } 

    //sorting by bubblesort
    public void sortDriversByLap(List<Driver> drivers) {
        Driver driver1;
        Driver driver2;
        for (int i = 0; i < drivers.size() - 1; i++) {
            for (int j = 0; j < drivers.size() - i - 1; j++) {
                if (drivers.get(j).getFastestLap() > drivers.get(j + 1).getFastestLap()) {
                    driver1 = drivers.get(j);
                    driver2 = drivers.get(j + 1);
                    drivers.set(j, driver2);
                    drivers.set(j + 1, driver1);
                }
            }
        }
        System.out.println("Sorting completed");
    }

    public void printArray(List<Driver> drivers) {
        System.out.println("Driver \tTeam \tcarCode \tGrand-Prix \tPosition-Finished \tFastest-Lap");
        for (Driver driver: drivers) {
           System.out.println(driver.toString());
        }
    }
}