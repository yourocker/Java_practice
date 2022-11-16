package HW16_Annons_and_Lambdas.solution1;

import HW16_Annons_and_Lambdas.AbstractDocumentsProcessor;
import HW16_Annons_and_Lambdas.Document;

public class DocumentsAbbreviatedProcessor extends AbstractDocumentsProcessor {
    @Override
    public Document processingLogic(Document document) {
        return new Document(document.getValue() % 1000);
    }
}
