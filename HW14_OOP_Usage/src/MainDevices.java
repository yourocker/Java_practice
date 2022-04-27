import Devices.DeviceInput;
import Devices.DeviceInputScanner;
import Devices.DeviceInputWithPrefix;
import Devices.DeviceInputWithTime;

public class MainDevices {
    public static void main(String[] args) {
        DeviceInput scanner = new DeviceInputScanner();
        DeviceInput withPrefix = new DeviceInputWithPrefix("От пользователя", scanner);
        DeviceInput withTime = new DeviceInputWithTime(withPrefix);
        DeviceInput withAnotherPrefix = new DeviceInputWithPrefix("Получено сообщение в " + withTime, withTime);

        String message = withTime.read();
        System.out.println(message);
    }
}
