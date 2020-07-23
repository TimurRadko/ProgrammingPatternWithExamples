package com.timurradko.decorator_example2;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(reader.readLine())))) {
            int c;
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
