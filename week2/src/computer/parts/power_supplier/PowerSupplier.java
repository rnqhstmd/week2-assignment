package computer.parts.power_supplier;

import computer.parts.OnOff;
import computer.parts.Parts;

public class PowerSupplier extends Parts implements OnOff {

    private String partsName;
    private PowerSupplierType type;
    private int price;
    private String company;
    private int output;

    public PowerSupplier(String partsName, PowerSupplierType type, int price, String company, int output) {
        super(partsName,price,company);
        this.type = type;
        this.output = output;
    }

    @Override
    public void run() {
        System.out.println(type +" 전원을 공급합니다.");
    }
}
