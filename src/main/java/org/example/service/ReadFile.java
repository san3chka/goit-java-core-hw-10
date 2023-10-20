package org.example.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public String getFileText(File file) {
        try (FileReader fileReader = new FileReader(file)) {
            int c;
            StringBuilder temp = new StringBuilder();
            while ((c = fileReader.read()) != -1) {
                temp.append((char) c);
            }
            return String.valueOf(temp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
