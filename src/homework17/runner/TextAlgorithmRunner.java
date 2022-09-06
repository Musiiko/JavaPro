package homework17.runner;

import homework17.engine.TextAlgorithm;

public class TextAlgorithmRunner {
    public static void main(String[] args) {
        String input = "A system of cells interlinked within cells, interlinked within cells, " +
                "interlinked within one stem this is biology. tenet, tnt, tenet";
        TextAlgorithm textAlgorithm = new TextAlgorithm(input);
        System.out.println(textAlgorithm.countOfWords());
        System.out.println(textAlgorithm.replaceChar(3, '&'));
        System.out.println(textAlgorithm.uniqWordsWithBeginAndEnd());
        System.out.println("Number of punctuation marks = " + textAlgorithm.countOfPunctMarks());
    }

}
