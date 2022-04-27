import Devices.*;
import Devices.Impl.IOServiceImpl;

public class Main {
    public static void main(String[] args) {
        IOService service = new IOServiceImpl();

        DeviceInput scanner = new DeviceInputScanner();
        DeviceInput withPrefix = new DeviceInputWithPrefix("От пользователя", scanner);
        DeviceInput withTime = new DeviceInputWithTime(withPrefix);
        DeviceInput withAnotherPrefix = new DeviceInputWithPrefix("Получено сообщение в ", withTime);

        DeviceOutput deviceOutput = new DeviceOutputErrImpl();

        service.setInput(withAnotherPrefix);
        service.setOutput(deviceOutput);

        service.printInformationAboutDevices();

        while(true) {
            String message = service.read();
            service.write(message);
        }
    }
}
