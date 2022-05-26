package com.github.salihbasic.ematuraconverter;

import java.util.ArrayList;

public class TekstualnoPitanje extends LinijskiOdgovor {

    public TekstualnoPitanje(String question, String right, String var1, String var2) {

        super.question = question;
        super.type = "dopunijedan";

        super.rightAnswers = new ArrayList<>(1);
        super.rightAnswers.add(right);

    }

}
