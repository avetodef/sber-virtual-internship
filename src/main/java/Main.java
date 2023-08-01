import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Parser parser = new Parser();
        ArrayList<City> cityList = parser.parseFile("src/main/resources/data.csv");
        sorter.sortCityListBy("name", cityList);
        sorter.sortCityListBy("district", cityList);
        cityList.forEach(city -> System.out.println(city.toString()));
    }


}
