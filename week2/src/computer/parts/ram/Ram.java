package computer.parts.ram;

import computer.parts.OnOff;
import computer.parts.Parts;

public class Ram extends Parts implements OnOff {
    private String partsName;
    private RamType type; // 부품명
    private int price; //가격
    private String company; //제조사
    private int volume; //용량

    public Ram(String partsName, RamType type, int price, String company, int volume) {
        super(partsName,price,company);
        this.type = type;
        this.volume = volume;
    }
    @Override
    public void run() {
        System.out.println(type + " 데이터를 읽습니다.");
    }
}
