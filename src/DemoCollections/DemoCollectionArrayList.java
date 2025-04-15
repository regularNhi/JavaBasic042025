package DemoCollections;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionArrayList {
    public static void main(String[] args) {

        //khai báo kiểu dữ liệu Map
        //Được phép lưu nhiều giá trị trùng lặp
        List<String> menu = new ArrayList<>();

        //ArrayList<String> menu2 = new ArrayList<>();

        //thêm dữ liệu
        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Task");
        menu.add("Sale");
        menu.add("Customer");
        menu.add("Project");

        //Xóa dữ liệu
        menu.remove(3);

        //Cập nhật dữ liệu
        menu.add(3, "Task 123");
        menu.set(4, "Report");

        //Get giá trị theo chỉ mục
        //Vị trí bắt đầu là 0
        System.out.println(menu.get(4));

        //Kiểm tra dữ liệu
        System.out.println(menu.contains("Dashboard"));//kiểm tra có tồn tại giá trị không

        System.out.println("============");

        //Duyệt dư liệu kiêểu ArrayList
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }

        System.out.println("============");
        //for cải tiến (không thường được sử dụng)
        int j = 0;
        for (String value : menu){
            System.out.println(menu.get(j)); //truy xuất giá trị từng phần tử sử dụng get
            j++;

        }

        System.out.println("***********");
        List<String> menu2 = new ArrayList<>();

        menu2.addAll(menu);
        for (int i = 0; i < menu2.size(); i++) {
            System.out.println(menu2.get(i));
        }

    }
}
