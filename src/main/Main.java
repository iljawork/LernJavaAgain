package main;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
    PhoneCleanerRegex regex = new PhoneCleanerRegex("+7 909 123-45-67");
    PhoneCleanerRegex regex2 = new PhoneCleanerRegex("+7 (909) 1234567");
    PhoneCleanerRegex regex3 = new PhoneCleanerRegex("8-905-1234567");
    PhoneCleanerRegex regex4 = new PhoneCleanerRegex("9-453-1234567");
    PhoneCleanerRegex regex5 = new PhoneCleanerRegex("8-905-123");
    PhoneCleanerRegex regex6 = new PhoneCleanerRegex("905-1234567");
    PhoneCleanerRegex regex7 = new PhoneCleanerRegex("8-905-12345672342");
    System.out.println(regex.PhoneRebild());
    System.out.println(regex2.PhoneRebild());
    System.out.println(regex3.PhoneRebild());
    System.out.println(regex4.PhoneRebild());
    System.out.println(regex5.PhoneRebild());
    System.out.println(regex6.PhoneRebild());
    System.out.println(regex7.PhoneRebild());


    }
}

/*
String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        String[] words = text.split("\\s+");


        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
*/