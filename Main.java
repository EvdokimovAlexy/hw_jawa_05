package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Main {

    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();

        phonebook.put("Иванов", List.of("+787865111-11-11", "+765655222-22-22", "+7855543245").toString());
        phonebook.put("Петров", List.of("+7928635454", "+79255465486").toString());
        phonebook.put("Сидоров", List.of("+7454564564", "+786423564").toString());
        phonebook.put("Горбунов", List.of("+7928475644", "+7925564586").toString());

        Set<String> phoneNumbers = phonebook.keySet();

        for (String i : phoneNumbers) {
            String num = phonebook.get(i);

            System.out.println("Пользователь: " + i + " ==> Номер: " + num);
        }
    }
}