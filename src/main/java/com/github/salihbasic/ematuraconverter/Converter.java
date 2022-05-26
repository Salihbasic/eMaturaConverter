package com.github.salihbasic.ematuraconverter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Converter {

    public static void main(String[] args) {

        EMaturaData data = new EMaturaData();

        Gson compact = new Gson();
        Gson pretty = new GsonBuilder().setPrettyPrinting().create();

        String compactJson = compact.toJson(data);
        String prettyJson = pretty.toJson(data);


        try {
            File compactFile = new File("src/main/resources/ematura-compact.json");
            compactFile.createNewFile();

            File prettyFile = new File("src/main/resources/ematura-full.json");
            prettyFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/main/resources/ematura-compact.json"),
                StandardCharsets.UTF_8)) {

            osw.write(compactJson);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/main/resources/ematura-full.json"),
                StandardCharsets.UTF_8)) {

            osw.write(prettyJson);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
