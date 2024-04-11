package computer.parts.mouse;

import computer.parts.OnOff;
import computer.parts.Parts;

public class Mouse extends Parts implements OnOff {
    private String partsName;
    private MouseType type;
    private int price;
    private String company;

    public Mouse(String partsName, MouseType type, int price, String company) {
        super(partsName,price,company);
        this.type = type;
    }


    @Override
    public void run() {
        System.out.println(type +" 클릭합니다.");
    }
}
