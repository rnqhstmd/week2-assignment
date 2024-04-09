package cooler;

public class Cooler {
    private CoolerType type;
    private int price;
    private String Company;
    private CoolerUsage usage; // 냉각방식

    public Cooler(CoolerType type, int price, String company, CoolerUsage usage) {
        this.type = type;
        this.price = price;
        this.Company = company;
        this.usage = usage;
    }

    public void on() {
        System.out.println("Cooler ON");
    }

    public void off() {
        System.out.println("Cooler off");
    }

    public void cool(){
        System.out.println(type +" 냉각합니다.");
    }
}
