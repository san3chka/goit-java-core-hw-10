package org.example.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonInit {
    //создал просто поиграться с жсоном
    public String getPhoneNumberJson() {
        PhoneNumber phoneNumber = new PhoneNumber("987-123-4567", "123 456 7890", "(123) 456-7890");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(phoneNumber);
    }

    public PhoneNumber getPhoneNumber() {
        return new Gson().fromJson(getPhoneNumberJson(), PhoneNumber.class);
    }
}

