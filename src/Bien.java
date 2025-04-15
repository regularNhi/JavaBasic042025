public class Bien {
    String address = "Can Tho" ; // biến toàn cục (instance)

    static String phone = "0901424462"; // biến static

    //Hàm thứ nhất
    public void sayhello()
    {
        int n = 10; //biến cục bộ (Local)

        System.out.println("Giá trị của n là: " + n);

        System.out.println(address);
    }

    //Hàm thứ hai
    public void getInfo(){
        System.out.println(address);
    }
    public static void main(String[] args) {

        //cách thức để gọi một thành phần trong 1 class vào hàm bất kỳ
        Bien bien = new Bien();
        System.out.println(bien.address);

        System.out.println(phone); //gọi từ biến static

        int number1 = 123456;
        int number2 = 789;

        String name = "Nhung";

        String ten = "Linh";

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(name);
        System.out.println(ten);
    }
}
