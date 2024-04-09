package keyboard;

public class Keyboard {
    private KeyboardType type;
    private int price;
    private String company;
    private KeyboardKeyArrangement arrangement;

    public Keyboard(KeyboardType type, int price, String company, KeyboardKeyArrangement arrangement) {
        this.type = type;
        this.price = price;
        this.company = company;
        this.arrangement = arrangement;
    }
    public void on() {
        System.out.println("Keyboard ON");
    }

    public void off() {
        System.out.println("Keyboard off");
    }

    public void typing(){
        System.out.println(type+" 타이핑합니다.");
    }

}
