package computer.parts.monitor;

import computer.parts.OnOff;
import computer.parts.Parts;

public class Monitor extends Parts implements OnOff {
    private String partsName;
    private MonitorType type;
    private int price;
    private String company;
    private int size;

    public Monitor(String partsName, MonitorType type, int price, String company, int size) {
        super(partsName, price, company);
        this.type = type;
        this.size = size;
    }

    @Override
    public void run() {
        System.out.println(type + " 화면을 출력합니다.");
    }
}
