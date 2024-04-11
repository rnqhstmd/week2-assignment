package computer.parts.keyboard;

import computer.parts.OnOff;
import computer.parts.Parts;

public class Keyboard extends Parts implements OnOff {
    private String partsName;
    private KeyboardType type;
    private int price;
    private String company;
    private KeyboardKeyArrangement arrangement;

    public Keyboard(String partsName, KeyboardType type, int price, String company, KeyboardKeyArrangement arrangement) {
        super(partsName, price, company);
        this.type = type;
        this.arrangement = arrangement;
    }

    @Override
    public void run() {
        System.out.println(type + " 타이핑합니다.");
    }
}
