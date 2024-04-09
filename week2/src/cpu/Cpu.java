package cpu;

public class Cpu {

    private CpuType type; //부품명
    private int price;// 가격
    private String company;//제조사
    private int velocity; //속도
    private CpuUsage usage; // 용도

    public Cpu(CpuType type, int price, String company, int velocity, CpuUsage usage) {
        this.type = type;
        this.price = price;
        this.company = company;
        this.velocity = velocity;
        this.usage = usage;
    }

    public void on() {
        System.out.println("CPU ON");
    }

    public void off() {
        System.out.println("CPU off");
    }

    public void processInstruction() {
        System.out.println(type + " 명령어를 처리합니다.");
    }
}
