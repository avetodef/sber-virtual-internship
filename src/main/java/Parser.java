import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Parser {
    private Scanner createScanner(String filePath){
        try{
            return new Scanner(new File(filePath));
        }
        catch (FileNotFoundException e){
            System.out.println("Filename " + filePath + " is not found. Check again");
        }
        return null;
    }

    public ArrayList<City> parseFile (String filePath){
        Scanner sc = createScanner(filePath);
        ArrayList<City> cityList = new ArrayList<>();

        while (true){
            assert sc != null;
            if (!sc.hasNextLine()) break;
            String info = sc.nextLine();
            String[] split = info.split(";", 6);
            City city = new City(split[1],
                    split[2],split[3],
                    Integer.parseInt(split[4]), split[5]);
            cityList.add(city);
        }
        return cityList;
    }

}
