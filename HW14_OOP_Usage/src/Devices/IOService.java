package Devices;

public interface IOService {
    void setInput(DeviceInput input);
    void setOutput(DeviceOutput output);

    String read();
    void write(String message);

    void printInformationAboutDevices();
}
