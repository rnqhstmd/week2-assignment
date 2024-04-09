package graphic_card;

public class GraphicCard {
    private GraphicCardType type; //부품명
    private int price;
    private String company;
    private GraphicCardUsage usage;

    public GraphicCard(GraphicCardType type, int price, String company, GraphicCardUsage usage) {
        this.type = type;
        this.price = price;
        this.company = company;
        this.usage = usage;
    }

    public void on() {
        System.out.println("GraphicCard ON");
    }

    public void off() {
        System.out.println("GraphicCard off");
    }

    public void render(){
        System.out.println(type + " 화면을 렌더링합니다.");
    }
}
