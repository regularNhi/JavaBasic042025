package StaticJava;

public class LoginPage {
    public static void main(String[] args) {
        WebUI.openURL(WebUI.url);
        WebUI.setText(WebUI.email);
        WebUI.setText(WebUI.password);
        WebUI.clickElement("Login Button");
    }
}
