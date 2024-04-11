package computer.parts.graphic_card;

import computer.parts.OnOff;
import computer.parts.Parts;

public class GraphicCard extends Parts {

    private GraphicCardType type; //부품명
    private GraphicCardUsage usage;

    public GraphicCard(String name, GraphicCardType type, int price, String company, GraphicCardUsage usage) {
        super(name,price,company);
        this.type = type;
        this.usage = usage;
    }

    @Override
    public void run() {
        System.out.println(type + " 화면을 렌더링합니다.");
    }
}
