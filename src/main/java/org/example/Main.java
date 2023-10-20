package org.example;

import org.example.service.FileCreator;
import org.example.service.JsonInit;
import org.example.service.PhoneNumber;
import org.example.solution.Task1;
import org.example.solution.Task2;
import org.example.solution.Task3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        firstTaskTest();
        System.out.println();
        secondTaskTest();
        System.out.println();
        thirdTaskTest();
    }

    private static void firstTaskTest() {
        System.out.println("задание 1");
        File file = new File("D:\\file.txt");
        PhoneNumber phoneNumber = new JsonInit().getPhoneNumber();
        FileCreator fileCreator = new FileCreator();
        file = fileCreator.create(file, String.format("%s,\n%s,\n%s", phoneNumber.getFirstNumber(), phoneNumber.getSecondNumber(), phoneNumber.getThirdNumber()));
        Task1 task1 = new Task1(file);
        task1.readFile();
        fileCreator.delete(file);
    }

    private static void secondTaskTest() {
        System.out.println("задание 2");
        File file = new File("D:\\file.txt");
        FileCreator fileCreator = new FileCreator();
        file = fileCreator.create(file,
                "name age \n" +
                        "alice 21 \n" +
                        "ryan 30");
        Task2 task2 = new Task2(file);
        System.out.println(task2.readFile());
        fileCreator.delete(file);
    }

    private static void thirdTaskTest() {
        System.out.println("задание 3");
        File file = new File("D:\\words.txt");
        FileCreator fileCreator = new FileCreator();
        file = fileCreator.create(file,
                "the day is sunny the the\n" +
                        "the sunny is is");
        Task3 task3 = new Task3(file);
        task3.returnCountWordsInFile();
        fileCreator.delete(file);
    }

}