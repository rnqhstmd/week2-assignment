package computer.parts.cpu;

import computer.parts.OnOff;
import computer.parts.Parts;

public class Cpu extends Parts implements OnOff {
    private String partsName;
    private CpuType type; //부품명
    private int price;// 가격
    private String company;//제조사
    private int velocity; //속도
    private CpuUsage usage; // 용도

    public Cpu(String partsName, CpuType type, int price, String company, int velocity, CpuUsage usage) {
        super(partsName,price,company);
        this.type = type;
        this.velocity = velocity;
        this.usage = usage;
    }

    @Override
    public void run() {
        System.out.println(type + " 명령어를 처리합니다.");
    }
}
