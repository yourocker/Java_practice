package HW16_Annons_and_Lambdas.lambdas.example1.solution2;

import HW16_Annons_and_Lambdas.annons.example1.Document;
import HW16_Annons_and_Lambdas.lambdas.example1.DocumentsProcessor;
import HW16_Annons_and_Lambdas.lambdas.example1.ProcessingLogic;

public class Main {
    public static void main(String[] args) {
        DocumentsProcessor processor = new DocumentsProcessor();

        ProcessingLogic abbreviatedProcessingLogic = document -> new Document(document.getValue() % 1000);

        ProcessingLogic removeUnnecessaryProcessingLogic = document -> {
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
        };
        Document d1 = new Document(123000346);
        Document d2 = new Document(23433223);
        Document d3 = new Document(400000743);
        Document d4 = new Document(99066778);
        Document d5 = new Document(230498234);
        Document d6 = new Document(89876987);

        processor.process(d1, abbreviatedProcessingLogic);
        processor.process(d2, abbreviatedProcessingLogic);
        processor.process(d3, document -> new Document(document.getValue() % 10));
        processor.process(d4, removeUnnecessaryProcessingLogic);
        processor.process(d5, removeUnnecessaryProcessingLogic);
        processor.process(d6, removeUnnecessaryProcessingLogic);

        processor.printDocuments();
    }
}
