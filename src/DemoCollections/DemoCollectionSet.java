package DemoCollections;

import java.util.HashSet;
import java.util.Iterator;
import  java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {

        //Khai báo kiểu dữ liệu Set
        //không lưu dữ liệu trùng lặp
        Set<String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Task");
        menu.add("Sale");
        menu.add("Project");

        System.out.println(menu.contains("Task"));
        menu.remove("Sale");
        System.out.println(menu.size());

        System.out.println("Các phần tử của Set");
        System.out.println("\t" + menu + "\n");

        //Duyệt giá trị trong SET
        //show set through Iterator (trong dấu ngoặc vuông là 1 cục dữ liệu
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println("\n============");
        // Show set through for-each, kh có ngoặc vuông là đã tách ra.
        System.out.println();
        for (String obj : menu) {
            System.out.print(obj + ", ");
        }
    }
}
