package computer;

import computer.parts.Parts;
import computer.parts.cooler.Cooler;
import computer.parts.cpu.Cpu;
import computer.parts.graphic_card.GraphicCard;
import computer.parts.keyboard.Keyboard;
import computer.parts.monitor.Monitor;
import computer.parts.mouse.Mouse;
import computer.parts.power_supplier.PowerSupplier;
import computer.parts.ram.Ram;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Cpu cpu;
    private GraphicCard graphicCard;
    private PowerSupplier powerSupplier;
    private Ram ram;

    private List<Parts> additionalParts; // 선택 부품들

    //핖수
    public Computer(Cpu cpu, GraphicCard graphicCard, PowerSupplier powerSupplier, Ram ram) {
        this.cpu = cpu;
        this.graphicCard = graphicCard;
        this.powerSupplier = powerSupplier;
        this.ram = ram;
        this.additionalParts=new ArrayList<>();
    }

    // 부팅
    public void boot() {
        System.out.println("컴퓨터 부팅합니다.");
        cpu.on();
        ram.on();
        graphicCard.on();
        powerSupplier.on();
        this.additionalParts.forEach(Parts::on);
    }

    // 종료
    public void shutDown() {
        System.out.println("컴퓨터 종료합니다.");
        cpu.off();
        graphicCard.off();
        powerSupplier.off();
        ram.off();
        this.additionalParts.forEach(Parts::off);
    }

    // 실행
    public void run() {
        System.out.println("컴퓨터의 기능을 전부 실행합니다.");
        this.cpu.run();
        this.graphicCard.run();
        this.powerSupplier.run();
        this.ram.run();
        this.additionalParts.forEach(Parts::run);

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
            if (cooler != null) {
                computer.additionalParts.add(cooler);
            }
            if (monitor != null) {
                computer.additionalParts.add(monitor);
            }
            if (mouse != null) {
                computer.additionalParts.add(mouse);
            }
            if (keyboard != null) {
                computer.additionalParts.add(keyboard);
            }
            return computer;
        }
    }


}
