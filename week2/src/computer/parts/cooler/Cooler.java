package computer.parts.cooler;

import computer.parts.OnOff;
import computer.parts.Parts;

public class Cooler extends Parts{
    private CoolerType type;
    private CoolerUsage usage; // 냉각방식

    public Cooler(String name, CoolerType type, int price, String company, CoolerUsage usage) {
        super(name, price, company);
        this.type = type;
        this.usage = usage;
    }

    @Override
    public void run() {
        System.out.println(type + " 냉각합니다.");
    }
}
