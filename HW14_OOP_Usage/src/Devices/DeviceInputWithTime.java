package Devices;

import java.time.LocalTime;

public class DeviceInputWithTime implements DeviceInput {
    private DeviceInput deviceInput;

    public DeviceInputWithTime(DeviceInput deviceInput) {
        this.deviceInput = deviceInput;
    }

    @Override
    public String getInformation() {
        return "Реализация входого потока со временем на безе " + deviceInput.getInformation();
    }

    @Override
    public String read() {
        return LocalTime.now() + ":" + deviceInput.read();
    }
}
