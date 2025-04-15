public class SwitchCase1 {
    public static void main(String[] args) {
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
                break;
        }

        String browser = "chrome";

        switch (browser){
            case "chrome":
                System.out.println("Chạy test với trình duyệt Chrome");

            case "edge":
                System.out.println("Chạy test với trình duyệt edge");
                break;
            case "safari":
                System.out.println("Chạy test với trình duyệt safari");
                break;
            default:
                System.out.println("Chạy test với trình duyệt chrome mặc định");
                break;
        }
    }
}
