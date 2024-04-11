package computer.parts.power_supplier;

import computer.parts.OnOff;
import computer.parts.Parts;

public class PowerSupplier extends Parts {

    private PowerSupplierType type;
    private int output;

    public PowerSupplier(String name, PowerSupplierType type, int price, String company, int output) {
        super(name,price,company);
        this.type = type;
        this.output = output;
    }

    @Override
    public void run() {
        System.out.println(type +" 전원을 공급합니다.");
    }
}
