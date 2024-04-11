package computer.parts.mouse;

import computer.parts.OnOff;
import computer.parts.Parts;

public class Mouse extends Parts implements OnOff {
    private MouseType type;

    public Mouse(String name, MouseType type, int price, String company) {
        super(name,price,company);
        this.type = type;
    }


    @Override
    public void run() {
        System.out.println(type +" 클릭합니다.");
    }
}
