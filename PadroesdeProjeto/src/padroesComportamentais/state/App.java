package padroesComportamentais.state;

public class App {
    public static void main(String[] args) {
        HeadPhone phone = new HeadPhone();
        phone.onClick();
        phone.onLongClick();
        phone.onClick();
        phone.onClick();
        phone.onClick();
        phone.onLongClick();
        phone.onClick();
    }
}