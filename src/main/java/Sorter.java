import java.util.*;

public class Sorter {


    private final List<String> params =  Arrays.asList("name", "district");
    private final Comparator<City> cityNameComparator = new CityNameComparator();
    private final Comparator<City> cityDistrictComparator = new CityDistrictComparator();

    private  Map<String, Comparator<City>> cmpMap;
    {
        cmpMap = new HashMap<>();
        cmpMap.put("name", cityNameComparator);
        cmpMap.put("district", cityDistrictComparator);
    }


    public ArrayList<City> sortCityListBy(String sortParam, ArrayList<City> cities){

        String param = findMatchingParam(sortParam);

        if (param == null){
            System.out.println("you cannot sort by this parameter ... yet");
            return cities;
        }

        Comparator<City> cmp = cmpMap.get(param);

        cities.sort(cmp);

        return cities;

    }

    private String findMatchingParam(String sortParam){
        for (String str: params){
            if (str.equals(sortParam)) return str;
        }
        return null;
    }


}
