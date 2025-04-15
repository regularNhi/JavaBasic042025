package IfElse;

public class DemoIFELSE {
    public static void main(String[] args) {

        String gender = "male";
        int age = 30;

        if (gender.equals("male") || age >=30) {
            System.out.println("Đi cuốc đất");
        } else {
            System.out.println("Đi hái rau");
        }
    }
}
