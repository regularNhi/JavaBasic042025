package DemoCollections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {

        //khai báo kiểu dữ liệu map
        //Không lưu được 2 key trùng lặp
        //Thường sd String String, String Interger, String Double
        Map<String, String> map = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();

        //thêm dữ liệu
        map.put("language","java");
        map.put("framework","laravel");
        map.put("library","Selenium");

        map2.put(1, 111D);
        map2.put(2, 222D);

        //Update dữ liệu
        map.put("library", "Playwright");

        System.out.println("Map 1: " + map);
        System.out.println("Map 2: " + map2);

        System.out.println(map.containsKey("language"));
        System.out.println(map.containsValue("java"));
        //map.remove("library");

        //duyệt kiểu dữ liệu Map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
