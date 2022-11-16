package HW16_Annons_and_Lambdas.solution2;

import HW16_Annons_and_Lambdas.AbstractDocumentsProcessor;
import HW16_Annons_and_Lambdas.Document;
import HW16_Annons_and_Lambdas.solution1.DocumentsAbbreviatedProcessor;
import HW16_Annons_and_Lambdas.solution1.DocumentsRemoveUnnecessaryProcessor;

public class Main {

    public static void main(String[] args) {
        Document d1 = new Document(123000346);
        Document d2 = new Document(23433223);
        Document d3 = new Document(400000743);
        Document d4 = new Document(99066778);
        Document d5 = new Document(230498234);
        Document d6 = new Document(89876987);

        AbstractDocumentsProcessor abbreviatedProcessor = new DocumentsAbbreviatedProcessor() {
            @Override
            public Document processingLogic (Document document) {
                return new Document(document.getValue() % 1000);
            }
        };

        AbstractDocumentsProcessor removeUnnecessaryProcessor = new AbstractDocumentsProcessor() {
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
        };
        //TODO: развернуть число обратно при вычитании нулей

        abbreviatedProcessor.process(d1);
        abbreviatedProcessor.process(d2);
        abbreviatedProcessor.process(d3);
        abbreviatedProcessor.process(d4);
        abbreviatedProcessor.process(d5);
        abbreviatedProcessor.process(d6);

        abbreviatedProcessor.printDocuments();

        removeUnnecessaryProcessor.process(d1);

        removeUnnecessaryProcessor.printDocuments();
    }
}
