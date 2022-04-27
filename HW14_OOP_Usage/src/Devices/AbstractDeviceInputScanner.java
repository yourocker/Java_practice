package Devices;

import java.util.Scanner;

public abstract class AbstractDeviceInputScanner implements DeviceInput {
    private Scanner scanner;

    public AbstractDeviceInputScanner() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String read() {
        return scanner.nextLine();
    }
}
