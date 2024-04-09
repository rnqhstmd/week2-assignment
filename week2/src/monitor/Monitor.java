package monitor;

public class Monitor {
    private MonitorType type;
    private int price;
    private String company;
    private int size;

    public Monitor(MonitorType type, int price, String company, int size) {
        this.type = type;
        this.price = price;
        this.company = company;
        this.size = size;
    }
    public void display(){
        System.out.println(type +" 화면을 출력합니다.");
    }

    public void on() {
        System.out.println("Monitor ON");
    }

    public void off() {
        System.out.println("Monitor off");
    }
}
