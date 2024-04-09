import cooler.Cooler;
import cooler.CoolerType;
import cooler.CoolerUsage;
import cpu.Cpu;
import cpu.CpuType;
import cpu.CpuUsage;
import graphic_card.GraphicCard;
import graphic_card.GraphicCardType;
import graphic_card.GraphicCardUsage;
import keyboard.Keyboard;
import keyboard.KeyboardKeyArrangement;
import keyboard.KeyboardType;
import monitor.Monitor;
import monitor.MonitorType;
import mouse.Mouse;
import mouse.MouseType;
import power_supplier.PowerSupplier;
import power_supplier.PowerSupplierType;
import ram.Ram;
import ram.RamType;

public class Main {
    public static void main(String[] args) {

        Cpu cpu1 = new Cpu(CpuType.Intel, 100000, "intel", 100, CpuUsage.Game);
        GraphicCard graphicCard1 = new GraphicCard(GraphicCardType.Nvidia, 700000, "Nvidia", GraphicCardUsage.Game);
        PowerSupplier powerSupplier1 = new PowerSupplier(PowerSupplierType.Thermaltake, 100000, "Thermaltake", 100);
        Ram ram1 = new Ram(RamType.Samsung, 200000, "Samsung", 32);
        Cooler cooler1 = new Cooler(CoolerType.Thermaltake, 140000, "Thermaltake", CoolerUsage.Air);
        Keyboard keyboard1 = new Keyboard(KeyboardType.Logitech, 190000, "Logitech", KeyboardKeyArrangement.ANSI);
        Monitor monitor1 = new Monitor(MonitorType.Samsung, 300000, "Samsung", 32);
        Mouse mouse1 = new Mouse(MouseType.Logitech, 50000, "Logitech");


        Computer computer = new Computer.ComputerBuilder()
                .cpu(cpu1)
                .ram(ram1)
                .graphicCard(graphicCard1)
                .powerSupplier(powerSupplier1)
//                .cooler(cooler)
                .mouse(mouse1)
                //.keyboard(keyboard1)
//                .monitor(monitor1)
                .build();

        computer.boot();
        computer.run();
        computer.shutdown();
    }
}