package Arraáy;

public class DemoMang2 {
    public static void main(String[] args) {
        //khai báo và gán giá trị cho mảng
        int number2[] = {5,7,10,12,30,45};

        number2[2] = 100;

        for (int i = 0; i < number2.length; i++){
            System.out.println(number2[i]);
        }

        String dataCustomerName[] = {"Hoa", "Hồng", "Huệ"};
        System.out.println(dataCustomerName[0]);
        System.out.println(dataCustomerName[1]);
        System.out.println(dataCustomerName[2]);

        boolean check = true;
        for (int i = 0; i < dataCustomerName.length; i++){

            if (dataCustomerName[i].equals("Quân")){
                check = true ;
                break;
            } else {
                check = false;
            }
        }
        if (check == true){
            System.out.println("Có bạn Quân");
        } else {
            System.out.println("Không tìm thấy bạn Quân");
        }
    }
}
