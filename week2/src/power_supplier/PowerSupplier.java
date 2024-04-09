package power_supplier;

public class PowerSupplier {
    private PowerSupplierType type;
    private int price;
    private String company;
    private int output;

    public PowerSupplier(PowerSupplierType type, int price, String company, int output) {
        this.type = type;
        this.price = price;
        this.company = company;
        this.output = output;
    }

    public void on() {
        System.out.println("PowerSupplier ON");
    }

    public void off() {
        System.out.println("PowerSupplier off");
    }
    public void supplyPower(){
        System.out.println(type +" 전원을 공급합니다.");
    }
}
