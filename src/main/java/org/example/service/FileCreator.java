package org.example.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {

    public File create(File file, String fileText){
        try {
            if(file.createNewFile()) {
                System.out.println("файл создан");
                setFile(file, fileText);
            }else {
                System.out.println("файл уже существует");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    public void delete(File file) {
        if (file.delete())
            System.out.println("файл удален");
         else
            System.out.println("Файла не обнаружено");
     }

    private void setFile(File file, String fileText) {
        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(fileText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
