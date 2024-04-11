import computer.Computer;
import computer.parts.cooler.Cooler;
import computer.parts.cooler.CoolerType;
import computer.parts.cooler.CoolerUsage;
import computer.parts.cpu.Cpu;
import computer.parts.cpu.CpuType;
import computer.parts.cpu.CpuUsage;
import computer.parts.graphic_card.GraphicCard;
import computer.parts.graphic_card.GraphicCardType;
import computer.parts.graphic_card.GraphicCardUsage;
import computer.parts.keyboard.Keyboard;
import computer.parts.keyboard.KeyboardKeyArrangement;
import computer.parts.keyboard.KeyboardType;
import computer.parts.monitor.Monitor;
import computer.parts.monitor.MonitorType;
import computer.parts.mouse.Mouse;
import computer.parts.mouse.MouseType;
import computer.parts.power_supplier.PowerSupplier;
import computer.parts.power_supplier.PowerSupplierType;
import computer.parts.ram.Ram;
import computer.parts.ram.RamType;

public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer.ComputerBuilder()
                .cpu(new Cpu("CPU",CpuType.Intel, 100000, "intel", 100, CpuUsage.Game))
                .ram(new Ram("Ram",RamType.Samsung, 200000, "Samsung", 32))
                .graphicCard(new GraphicCard("GraphicCard",GraphicCardType.Nvidia, 700000, "Nvidia", GraphicCardUsage.Game))
                .powerSupplier(new PowerSupplier("PowerSupplier",PowerSupplierType.Thermaltake, 100000, "Thermaltake", 100))
                //.cooler(new Cooler("Cooler",CoolerType.Thermaltake, 140000, "Thermaltake", CoolerUsage.Air))
                //.mouse(new Mouse("Mouse",MouseType.Logitech, 50000, "Logitech"))
                //.keyboard(new Keyboard("KeyBoard",KeyboardType.Logitech, 190000, "Logitech", KeyboardKeyArrangement.ANSI))
                .monitor(new Monitor("Monitor",MonitorType.Samsung, 300000, "Samsung", 32))
                .build();

        computer1.boot();
        computer1.run();
        computer1.shutDown();
    }
}