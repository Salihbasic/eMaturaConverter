package com.github.salihbasic.ematuraconverter;

import java.util.ArrayList;
import java.util.List;

public class Pitanje {

    private final String type;
    private final String question;
    private final String rightAnswer;
    private final List<String> wrongAnswers;
    private final String hint;

    public Pitanje(String question, String rightAnswer, String wrong1, String wrong2, String wrong3, String hint) {

        this.question = question;
        this.rightAnswer = rightAnswer;
        this.hint = hint;

        this.wrongAnswers = new ArrayList<>(3);
        wrongAnswers.add(wrong1);
        wrongAnswers.add(wrong2);
        wrongAnswers.add(wrong3);

        this.type = "pitanje";
    }

}
