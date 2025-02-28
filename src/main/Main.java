package main;

public class Main {

    public static void main(String[] args) {
        Computer gameComputer = new Computer("HuperX", "Сашкин комп");
        gameComputer.setCpu(new CPU(Frequency.Two,Manufacturer.AMD,NumberOfCores.Four));
        gameComputer.setStorage(new Storage(StorageType.SSD,StorageVolume.Maximum));
        gameComputer.setRam(new RAM(RamVolume.Eight,TypeRam.DDR5));
        gameComputer.setScreen(new Screen(ScreenType.IPS,Diagonal.Large));
        gameComputer.setKeyboard(new Keyboard(KeyboardType.Mechanic,KeyboardLight.YES));
        System.out.println(gameComputer.println());
    }
}