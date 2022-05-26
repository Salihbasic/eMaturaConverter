package com.github.salihbasic.ematuraconverter;

import java.util.ArrayList;

public class DoubleQuestion extends LinijskiOdgovor {

    public DoubleQuestion(String question, String right1, String right2) {

        super.question = question;
        super.type = "dopunidva";

        super.rightAnswers = new ArrayList<>(2);
        super.rightAnswers.add(right1);
        super.rightAnswers.add(right2);

    }

}
