package Devices.Impl;

import Devices.DeviceInput;
import Devices.DeviceOutput;
import Devices.IOService;

public class IOServiceImpl implements IOService {

    private DeviceInput input;
    private DeviceOutput output;

    @Override
    public void setInput(DeviceInput input) {
        this.input = input;
    }

    @Override
    public void setOutput(DeviceOutput output) {
        this.output = output;
    }

    @Override
    public String read() {
        return input.read();
    }

    @Override
    public void write(String message) {
        output.write(message);
    }

    @Override
    public void printInformationAboutDevices() {
        System.out.println(input.getInformation());
        System.out.println(output.getInformation());
    }
}
