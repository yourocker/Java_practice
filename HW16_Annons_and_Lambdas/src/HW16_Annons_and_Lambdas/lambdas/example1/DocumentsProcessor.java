package HW16_Annons_and_Lambdas.lambdas.example1;

import HW16_Annons_and_Lambdas.annons.example1.Document;

public class DocumentsProcessor {
    private static final int MAX_PROCESSOR_DOCUMENTS_COUNT = 10;

    private Document[] documents;
    private int count;

    public DocumentsProcessor() {
        this.documents = new Document[MAX_PROCESSOR_DOCUMENTS_COUNT];
        this.count = 0;
    }

    public void printDocuments() {
        for (int i = 0; i < count; i++) {
            System.out.println("Документ - " + documents[i].getValue());
        }
    }

    public void process(Document document, ProcessingLogic processingLogic) {
        if (isHasSize()) {
            Document processed = processingLogic.process(document);
            save(processed);
        } else {
            System.err.println("Кончилось место для обработки документов");
        }
    }

    private void save(Document document) {
        documents[count] = document;
        count++;
    }

    private boolean isHasSize() {
        return count < MAX_PROCESSOR_DOCUMENTS_COUNT;
    }
}