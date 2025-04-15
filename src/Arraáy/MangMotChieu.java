package Arraáy;

public class MangMotChieu {

    public static void main(String[] args) {

        //Khai báo mảng rỗng, chưa mang giá trị
        int number1[] = new int[5];

        //gán giá trị cho mảng
        number1[0] = 40;
        number1[1] = 60;
        number1[2] = 10;
        number1[3] = 20;
        number1[4] = 500;

        //lấy độ dài mảng dùng length
        System.out.println("Độ dài mảng là: "+ number1.length);

        //duyệt mảng để lấy giá trị ra
        for (int i = 0; i < number1.length; i++) {
            System.out.println(number1[i]);
        }

        System.out.println("===============");
        for (int number : number1){
            System.out.println(number);
        }
    }
}
