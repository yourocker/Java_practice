package HW16_Annons_and_Lambdas.annons.example1.solution1;

import HW16_Annons_and_Lambdas.annons.example1.Document;

public class Main {

    public static void main(String[] args) {
        Document d1 = new Document(123000346);
        Document d2 = new Document(23433223);
        Document d3 = new Document(400000743);
        Document d4 = new Document(99066778);
        Document d5 = new Document(230498234);
        Document d6 = new Document(89876987);

        DocumentsAbbreviatedProcessor processor = new DocumentsAbbreviatedProcessor();

        processor.process(d1);
        processor.process(d2);
        processor.process(d3);
        processor.process(d4);
        processor.process(d5);
        processor.process(d6);

        processor.printDocuments();

        DocumentsRemoveUnnecessaryProcessor processor1 = new DocumentsRemoveUnnecessaryProcessor();
        processor1.process(d1);
        processor1.process(d2);
        processor1.process(d3);
        processor1.process(d4);
        processor1.process(d5);
        processor1.process(d6);

        processor1.printDocuments();
    }
}
