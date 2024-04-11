package computer.parts;

public abstract class Parts implements OnOff {
    protected String partsName;
    protected int price;
    protected String company;

    public Parts(String partsName, int price, String company) {
        this.partsName = partsName;
        this.price = price;
        this.company = company;
    }

    @Override
    public void on() {
        System.out.println(partsName +" ON");
    }

    @Override
    public void off() {
        System.out.println(partsName +" OFF");
    }

    public abstract void run();
}
