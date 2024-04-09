import cooler.Cooler;
import cpu.Cpu;
import graphic_card.GraphicCard;
import keyboard.Keyboard;
import monitor.Monitor;
import mouse.Mouse;
import power_supplier.PowerSupplier;
import ram.Ram;

public class Computer {
    private Cpu cpu;
    private Cooler cooler;
    private GraphicCard graphicCard;
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    private PowerSupplier powerSupplier;
    private Ram ram;

    //핖수
    public Computer(Cpu cpu, GraphicCard graphicCard, PowerSupplier powerSupplier, Ram ram) {
        this.cpu = cpu;

        this.graphicCard = graphicCard;


        this.powerSupplier = powerSupplier;
        this.ram = ram;
    }

    //선택
    public static class ComputerBuilder {
        private Cpu cpu;
        private Cooler cooler;
        private GraphicCard graphicCard;
        private Keyboard keyboard;
        private Monitor monitor;
        private Mouse mouse;
        private PowerSupplier powerSupplier;
        private Ram ram;

        public ComputerBuilder cpu(Cpu cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder cooler(Cooler cooler) {
            this.cooler = cooler;
            return this;
        }

        public ComputerBuilder graphicCard(GraphicCard graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public ComputerBuilder keyboard(Keyboard keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder monitor(Monitor monitor) {
            this.monitor = monitor;
            return this;
        }

        public ComputerBuilder mouse(Mouse mouse) {
            this.mouse = mouse;
            return this;
        }

        public ComputerBuilder powerSupplier(PowerSupplier powerSupplier) {
            this.powerSupplier = powerSupplier;
            return this;
        }

        public ComputerBuilder ram(Ram ram) {
            this.ram = ram;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer(cpu, graphicCard, powerSupplier, ram);
            computer.monitor = this.monitor;
            computer.cooler = this.cooler;
            computer.mouse = this.mouse;
            computer.keyboard = this.keyboard;
            return computer;
        }
    }

    // 부팅
    public void boot() {
        System.out.println("컴퓨터 부팅합니다.");
        cpu.on();
        ram.on();
        powerSupplier.on();
        if (cooler != null) {
            cooler.on();
        }
        if (keyboard != null) {
            keyboard.on();
        }
        if (monitor != null) {
            monitor.on();
        }
        if (mouse != null) {
            mouse.on();
        }



    }

    // 종료
    public void shutdown() {
        System.out.println("컴퓨터 종료합니다.");
        cpu.off();
        graphicCard.off();
        powerSupplier.off();
        ram.off();
        if (cooler != null) {
            cooler.off();
        }
        if (keyboard != null) {
            keyboard.off();
        }
        if (monitor != null) {
            monitor.off();
        }
        if (mouse != null) {
            mouse.off();
        }

    }

    // 실행
    public void run() {
        System.out.println("컴퓨터의 기능을 전부 실행합니다.");
        cpu.processInstruction();
        ram.readData();
        graphicCard.render();
        powerSupplier.supplyPower();
        if (cooler != null) {
            cooler.cool();
        }
        if (mouse != null) {
            mouse.click();
        }
        if (keyboard != null) {
            keyboard.typing();
        }
        if (monitor != null) {
            monitor.display();
        }

    }
}
