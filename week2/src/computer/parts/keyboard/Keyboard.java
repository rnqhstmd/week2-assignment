package computer.parts.keyboard;

import computer.parts.OnOff;
import computer.parts.Parts;

public class Keyboard extends Parts {
    private KeyboardType type;
    private KeyboardKeyArrangement arrangement;

    public Keyboard(String name, KeyboardType type, int price, String company, KeyboardKeyArrangement arrangement) {
        super(name, price, company);
        this.type = type;
        this.arrangement = arrangement;
    }

    @Override
    public void run() {
        System.out.println(type + " 타이핑합니다.");
    }
}
