package computer.parts.ram;

import computer.parts.OnOff;
import computer.parts.Parts;

public class Ram extends Parts {
    private RamType type; // 부품명
    private int volume; //용량

    public Ram(String name, RamType type, int price, String company, int volume) {
        super(name,price,company);
        this.type = type;
        this.volume = volume;
    }
    @Override
    public void run() {
        System.out.println(type + " 데이터를 읽습니다.");
    }
}
