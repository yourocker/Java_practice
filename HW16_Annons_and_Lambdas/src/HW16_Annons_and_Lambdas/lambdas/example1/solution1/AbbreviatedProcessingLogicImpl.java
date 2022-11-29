package HW16_Annons_and_Lambdas.lambdas.example1.solution1;

import HW16_Annons_and_Lambdas.annons.example1.Document;
import HW16_Annons_and_Lambdas.lambdas.example1.ProcessingLogic;

public class AbbreviatedProcessingLogicImpl implements ProcessingLogic {
    @Override
    public Document process(Document document) {
            return new Document(document.getValue() % 1000);
        }
    }
