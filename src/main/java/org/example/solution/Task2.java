package org.example.solution;

import com.google.gson.Gson;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.example.service.User;
import org.example.service.ReadFile;


import java.io.File;


public class Task2 {
    private final File file;

    public Task2(File file) {
        this.file = file;
    }

    public String readFile() {
        String fileText = new ReadFile().getFileText(file);
        String[] words = fileText.split(" ");
        User user1 = new User(words[2].strip(), Integer.parseInt(words[3].strip()));
        User user2 = new User(words[4].strip(), Integer.parseInt(words[5].strip()));
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonArray jsonArray = new JsonArray();

        JsonObject alice = new JsonObject();
        alice.addProperty(words[0].strip(), user1.getName());
        alice.addProperty(words[1].strip(), user1.getAge());

        JsonObject ryan = new JsonObject();
        ryan.addProperty(words[0].strip(), user2.getName());
        ryan.addProperty(words[1].strip(), user2.getAge());

        jsonArray.add(alice);
        jsonArray.add(ryan);


        return gson.toJson(jsonArray);

    }

}
