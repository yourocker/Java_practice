package tasks.Core4Files;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Core448 {
    public static void logger() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.log(Level.INFO, "Все хорошо");
        logger.log(Level.WARNING, "Произошла ошибка");
    }
}
