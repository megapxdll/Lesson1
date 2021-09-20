package ru.geekbrains.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    HashMap<String, List> phones = new HashMap<>();

    public void AddPhone(String Surname, String number) {
        if (!phones.containsKey(Surname)) {
            phones.put(Surname, new ArrayList());
        }
        phones.get(Surname).add(number);
    }

    public void Get(String Surname) {
        System.out.print(Surname + ": " + phones.get(Surname));
    }

    public void GetAll() {
        for (Map.Entry<String, List> o : phones.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }

    }
}
