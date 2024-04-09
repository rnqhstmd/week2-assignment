package mouse;

public class Mouse {
    private MouseType type;
    private int price;
    private String company;

    public Mouse(MouseType type, int price, String company) {
        this.type = type;
        this.price = price;
        this.company = company;
    }

    public void on() {
        System.out.println("Mouse ON");
    }

    public void off() {
        System.out.println("Mouse off");
    }

    public void click(){
        System.out.println(type +" 클릭합니다.");
    }
}
