public class XuLyChuoi {

    public static void main(String[] args) {
        String s1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        String s2 = "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

        //chuỗi bắt đầu từ 0; tính khoảng trắng là 1 ký tự.

        //Cắt chuỗi
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(6,11));
        System.out.println("==========================");

        //Ghép chuỗi
        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(s2));
        System.out.println("==========================");

        //Chuyển kiểu in hoa thường
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println("==========================");

        //Xóa kí tự khoảng trắng 2 đầu
        String s3 = "  Test Automation  ";
        System.out.println(s3.trim());
        System.out.println("==========================");

        //Độ dài chuỗi
        System.out.println(s1.length());
        System.out.println("==========================");

        //Tìm kiếm kí tự
        System.out.println(s2.charAt(10));
        System.out.println("==========================");

        //So sánh chuỗi
        //+ so sánh bằng
        String s4 = "Test Automation";
        String s5 = "test automation";
        System.out.println(s4.equals(s5));

        //+so sánh chứa (có phân biệt hoa thường
        System.out.println(s4.contains("Automation"));
        System.out.println("==========================");

        //So sánh bỏ qua hoa thường
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
