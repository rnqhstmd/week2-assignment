package ram;

public class Ram {
    private RamType type; // 부품명
    private int price; //가격
    private String company; //제조사
    private int volume; //용량

    public Ram(RamType type, int price, String company, int volume) {
        this.type = type;
        this.price = price;
        this.company = company;
        this.volume = volume;
    }

    public void on() {
        System.out.println("Ram ON");
    }

    public void off() {
        System.out.println("Ram off");
    }

    public void readData(){
        System.out.println(type + " 데이터를 읽습니다.");
    }
}
