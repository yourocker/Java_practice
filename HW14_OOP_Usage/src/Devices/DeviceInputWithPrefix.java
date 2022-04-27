package Devices;

import Devices.DeviceInput;

public class DeviceInputWithPrefix implements DeviceInput {
    // принимаем на вход устройство для чтения
    private DeviceInput deviceInput;
    private String prefix;

    public DeviceInputWithPrefix(String prefix, DeviceInput deviceInput) {
        this.deviceInput = deviceInput;
        this.prefix = prefix;
    }

    @Override
    public String read() {
        return prefix + ": " + deviceInput.read();
    }

    @Override
    public String getInformation() {
        return "Реализация входного потока с префиксом на базе" + deviceInput.getInformation();
    }
}
