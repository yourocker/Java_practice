package Devices;

public class DeviceOutputStandartImpl implements DeviceOutput {
    @Override
    public String getInformation() {
        return "Реализация на основе стандартного вывода";
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
