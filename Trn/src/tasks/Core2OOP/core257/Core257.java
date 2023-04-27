package tasks.Core2OOP.core257;

public class Core257 {

    interface TextAnalyzer {
        Label processText(String text);
    }

    public static abstract class KeywordAnalyser implements TextAnalyzer {
        protected abstract String[] getKeywords();

        protected abstract Label getLabel();

        public Label processText(String text) {
            String[] keywords = getKeywords();
            for (String keyword : keywords) {
                if (text.contains(keyword)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }

    public static class SpamAnalyser extends KeywordAnalyser implements TextAnalyzer {
        private String[] keywords;

        public SpamAnalyser(String[] keywords) {
            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }

    public static class NegativeTextAnalyser extends KeywordAnalyser implements TextAnalyzer {
        private final String[] KEYWORDS = {":(", "=(", ":|"};

        @Override
        protected String[] getKeywords() {
            return KEYWORDS;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    public static class TooLongTextAnalyser implements TextAnalyzer {
        private int maxLength;

        public TooLongTextAnalyser(int length) {
            this.maxLength = length;
        }

        @Override
        public Label processText(String text) {
            if (text.length() > maxLength) {
                return Label.TOO_LONG;
            } else {
                return Label.OK;
            }
        }
    }

    Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++)
            if (analyzers[i].processText(text) != Label.OK) {
                return analyzers[i].processText(text);
            }
        return Label.OK;
    }


    public static void main(String[] args) {
        // инициализация анализаторов для проверки в порядке данного набора анализаторов
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 40;
        TextAnalyzer[] textAnalyzers1 = {
                new SpamAnalyser(spamKeywords),
                new NegativeTextAnalyser(),
                new TooLongTextAnalyser(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers2 = {
                new SpamAnalyser(spamKeywords),
                new TooLongTextAnalyser(commentMaxLength),
                new NegativeTextAnalyser()
        };
        TextAnalyzer[] textAnalyzers3 = {
                new TooLongTextAnalyser(commentMaxLength),
                new SpamAnalyser(spamKeywords),
                new NegativeTextAnalyser()
        };
        TextAnalyzer[] textAnalyzers4 = {
                new TooLongTextAnalyser(commentMaxLength),
                new NegativeTextAnalyser(),
                new SpamAnalyser(spamKeywords)
        };
        TextAnalyzer[] textAnalyzers5 = {
                new NegativeTextAnalyser(),
                new SpamAnalyser(spamKeywords),
                new TooLongTextAnalyser(commentMaxLength)
        };
        TextAnalyzer[] textAnalyzers6 = {
                new NegativeTextAnalyser(),
                new TooLongTextAnalyser(commentMaxLength),
                new SpamAnalyser(spamKeywords)
        };
        // тестовые комментарии
        String[] tests = new String[8];
        tests[0] = "This comment is so good.";                            // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
        tests[4] = "This comment is so bad....";                          // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
                textAnalyzers4, textAnalyzers5, textAnalyzers6};
        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
        for (String test : tests) {
            numberOfAnalyzer = 1;
            System.out.print("test #" + numberOfTest + ": ");
            System.out.println(test);
            for (TextAnalyzer[] analyzers : textAnalyzers) {
                System.out.print(numberOfAnalyzer + ": ");
//                System.out.println(testObject.checkLabels(analyzers, test));
//                numberOfAnalyzer++;
            }
            numberOfTest++;
        }
    }
}
