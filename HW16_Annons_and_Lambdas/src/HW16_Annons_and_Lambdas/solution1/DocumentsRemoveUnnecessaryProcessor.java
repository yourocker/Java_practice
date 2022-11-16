package HW16_Annons_and_Lambdas.solution1;

import HW16_Annons_and_Lambdas.AbstractDocumentsProcessor;
import HW16_Annons_and_Lambdas.Document;

public class DocumentsRemoveUnnecessaryProcessor extends AbstractDocumentsProcessor {

    @Override
    public Document processingLogic(Document document) {
        int value = document.getValue();
        int newValue = 0;

        while (value != 0) {
            int digit = value % 10;
            if (digit != 0) {
                newValue = newValue + digit;
                newValue = newValue * 10;
            }
            value = value / 10;
        }

        return new Document(newValue / 10);
    }
}

//TODO: Сделать так чтобы число не разворачивало (или развернуть обратно)
