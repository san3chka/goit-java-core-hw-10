package org.example.solution;

import org.example.service.ReadFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    private final File file;

    public Task1(File file) {
        this.file = file;
    }

    public void readFile() {
        String fileText = new ReadFile().getFileText(file);
        String regex1 = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        String regex2 = "^\\d{3}-\\d{3}-\\d{4}$";
        String[] words = fileText.split(",");
        for (int i = 0; i < words.length; i++) {
            if (words[i].strip().matches(regex1) || words[i].strip().matches(regex2)) {
                System.out.println(words[i].strip());
            }
        }
    }
}
