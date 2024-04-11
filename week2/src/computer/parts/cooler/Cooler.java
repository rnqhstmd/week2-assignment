package computer.parts.cooler;

import computer.parts.OnOff;
import computer.parts.Parts;

public class Cooler extends Parts implements OnOff {
    private String partsName;
    private CoolerType type;
    private int price;
    private String Company;
    private CoolerUsage usage; // 냉각방식

    public Cooler(String partsName, CoolerType type, int price, String company, CoolerUsage usage) {
        super(partsName, price, company);
        this.type = type;
        this.usage = usage;
    }

    @Override
    public void run() {
        System.out.println(type + " 냉각합니다.");
    }
}
