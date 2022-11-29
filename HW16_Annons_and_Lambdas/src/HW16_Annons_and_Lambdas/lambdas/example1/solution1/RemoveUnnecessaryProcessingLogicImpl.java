package HW16_Annons_and_Lambdas.lambdas.example1.solution1;

import HW16_Annons_and_Lambdas.annons.example1.Document;
import HW16_Annons_and_Lambdas.lambdas.example1.ProcessingLogic;

public class RemoveUnnecessaryProcessingLogicImpl implements ProcessingLogic {
    @Override
    public Document process(Document document) {
        int value = document.getValue();
        int newValue = 0;
        int newValue1 = 0;

        while (value != 0) {
            int digit = value % 10;
            if (digit != 0) {
                newValue = newValue + digit;
                newValue = newValue * 10;
            }
            value /= 10;
        }

        newValue = newValue / 10;

        while (newValue != 0) {
            int digit = newValue % 10;
            newValue1 = newValue1 + digit;
            newValue1 = newValue1 * 10;
            newValue = newValue / 10;
        }

        return new Document(newValue1 / 10);
    }
}
