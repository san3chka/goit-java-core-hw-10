package org.example.service;

import java.io.*;

public class ReadFile {
    public String getFileText(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder temp = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                temp.append(line).append(System.lineSeparator());
            }
            return temp.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
