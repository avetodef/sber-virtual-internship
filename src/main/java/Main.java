import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Parser parser = new Parser();
        ArrayList<City> cityList = parser.parseFile("src/main/resources/data.csv");
        cityList.forEach(city -> System.out.println(city.toString()));
    }
}
