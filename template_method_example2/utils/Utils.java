package com.timurradko.template_method_example2.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
    private static final String YES = "y";
    private static final String NO = "n";

    public static String getUserAnswer(String question) {
        System.out.println(question);
        String answer = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                answer = reader.readLine();
                if (answer.toLowerCase().equals(YES) || answer.toLowerCase().equals(NO)) {
                    break;
                } else {
                    System.out.println("Please, write \"y\" or \"n\"!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }

    public static String getYES() {
        return YES;
    }
}
