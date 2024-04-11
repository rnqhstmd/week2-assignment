package computer.parts;

public abstract class Parts implements OnOff {
    protected String name;
    protected int price;
    protected String company;

    public Parts(String name, int price, String company) {
        this.name = name;
        this.price = price;
        this.company = company;
    }

    @Override
    public void on() {
        System.out.println(name +" ON");
    }

    @Override
    public void off() {
        System.out.println(name +" OFF");
    }

    public abstract void run();
}
