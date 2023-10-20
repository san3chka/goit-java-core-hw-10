package org.example.solution;

import org.example.service.ReadFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private final File file;

    public Task3(File file) {
        this.file = file;
    }

    public void returnCountWordsInFile() {
        String textFile = new ReadFile().getFileText(file);
        String[] words = textFile.split("\\s+|\\n+");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
