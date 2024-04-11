package computer.parts.graphic_card;

import computer.parts.OnOff;
import computer.parts.Parts;

public class GraphicCard extends Parts implements OnOff {

    private String partsName;
    private GraphicCardType type; //부품명
    private int price;
    private String company;
    private GraphicCardUsage usage;

    public GraphicCard(String partsName, GraphicCardType type, int price, String company, GraphicCardUsage usage) {
        super(partsName,price,company);
        this.type = type;
        this.usage = usage;
    }

    @Override
    public void run() {
        System.out.println(type + " 화면을 렌더링합니다.");
    }
}
