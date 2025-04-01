package main;

import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class EmailList {
    private final TreeSet<String> emailList = new TreeSet<>();
    private static final String Email_Pattern = "[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+";

    private boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return Pattern.matches(Email_Pattern, email);
    }

    public void addEmail(String email) {
        if (isValidEmail(email)) {
            emailList.add(email.toLowerCase());
        } else
            System.out.println("Invalid email");
    }

    public void listEmails() {
        if (emailList.isEmpty()) {
            System.out.println("Email list is empty");
            return ;
        }
        int index = 1;
        for (String email : emailList) {
            System.out.println(index++ + ". " + email);
        }
    }
}