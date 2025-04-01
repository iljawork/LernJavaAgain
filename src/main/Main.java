package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmailList emailList = new EmailList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите одну из команд: ADD, LIST, чтобы завершить нажмите EXIT");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("EXIT")) {
                break;
            } else if (command.equalsIgnoreCase("LIST")) {
                emailList.listEmails();
            } else if (command.toUpperCase().startsWith("ADD")) {
                String email = command.substring(4).trim();
                emailList.addEmail(email);
            } else {
                System.out.println("Неизвестная команда");
            }
        }
    }
}