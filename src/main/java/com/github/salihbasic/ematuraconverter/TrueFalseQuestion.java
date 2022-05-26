package com.github.salihbasic.ematuraconverter;

public class TrueFalseQuestion {

    private final String type;

    private final String question;

    private final boolean rightAnswer;

    public TrueFalseQuestion(String question, String truth) {

        this.question = question;

        this.rightAnswer = Boolean.getBoolean(truth);

        this.type = "tacnonetacno";
    }

}
