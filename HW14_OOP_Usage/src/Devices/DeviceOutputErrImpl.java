package Devices;

public class DeviceOutputErrImpl implements DeviceOutput {
    @Override
    public String getInformation() {
        return "Реализация потока ошибки";
    }

    @Override
    public void write(String message) {
        System.err.println(message);
    }
}
