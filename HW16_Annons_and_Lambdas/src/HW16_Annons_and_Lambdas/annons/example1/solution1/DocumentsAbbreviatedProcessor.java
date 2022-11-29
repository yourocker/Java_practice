package HW16_Annons_and_Lambdas.annons.example1.solution1;

import HW16_Annons_and_Lambdas.annons.example1.AbstractDocumentsProcessor;
import HW16_Annons_and_Lambdas.annons.example1.Document;

public class DocumentsAbbreviatedProcessor extends AbstractDocumentsProcessor {
    @Override
    public Document processingLogic(Document document) {
        return new Document(document.getValue() % 1000);
    }
}