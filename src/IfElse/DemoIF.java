package IfElse;

public class DemoIF {

    public static void main(String[] args) {
        int age = 20;
        String address = "Can Tho";
        String header = "Login CMS Page";

        if (age >18 && address.equals("Ha Noi"))
        {
            System.out.println("Được đi NVQS");
        }
        if (header.contains("Login"))
        {
            System.out.println("Đã đến trang Login");
        }
    }
}
