package HW16_Annons_and_Lambdas.lambdas.example1.solution1;

import HW16_Annons_and_Lambdas.annons.example1.Document;
import HW16_Annons_and_Lambdas.lambdas.example1.DocumentsProcessor;
import HW16_Annons_and_Lambdas.lambdas.example1.ProcessingLogic;

public class Main {
    public static void main(String[] args) {
        DocumentsProcessor processor = new DocumentsProcessor();

        ProcessingLogic abbreviatedProcessingLogic = new AbbreviatedProcessingLogicImpl();
        ProcessingLogic removeUnnecessaryProcessingLogic = new RemoveUnnecessaryProcessingLogicImpl();

        Document d1 = new Document(123000346);
        Document d2 = new Document(23433223);
        Document d3 = new Document(400000743);
        Document d4 = new Document(99066778);
        Document d5 = new Document(230498234);
        Document d6 = new Document(89876987);

        processor.process(d1, abbreviatedProcessingLogic);
        processor.process(d2, abbreviatedProcessingLogic);
        processor.process(d3, abbreviatedProcessingLogic);
        processor.process(d4, removeUnnecessaryProcessingLogic);
        processor.process(d5, removeUnnecessaryProcessingLogic);
        processor.process(d6, removeUnnecessaryProcessingLogic);

        processor.printDocuments();
    }
}
