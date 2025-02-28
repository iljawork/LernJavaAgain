package main;

public class Computer {
    final String vendor;
    final String name;
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }
    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public final double getTotalComputerWeight() {
        return cpu.getDiskWeight() + ram.getRamWeight() + storage.getStorageWeight() + screen.getScreenWidth() + keyboard.getKeyboardWeight();
    }


    public String println() {
        return "Характеристики ПК: \n"
                + "Наименование ПК:" + getName() + '\n' +
                "Производитель: " + getVendor() + '\n' +
                "Процессор: " + getCpu() + '\n' +
                "Оперативная память: " + getRam() + '\n' +
                "Накопитель информации: " + getStorage() + '\n' +
                "Экран: " + getScreen() + '\n' +
                "Клавиатура: " + getKeyboard() + '\n' +
                "Общая масса ПК: " + getTotalComputerWeight();
    }




}
