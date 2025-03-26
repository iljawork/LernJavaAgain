package main;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите в консоль одно из значений: LIST, ADD, EDIT, DELETE. Чтобы зевершить работу программы введите - EXIT");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("EXIT")) {
                break;
            }

            String[] parts = input.split("\s", 3);
            String commands = parts[0].toUpperCase();

            switch (commands) {
                case "LIST":
                    List<String> todos = toDoList.getTodos();
                    if (todos.isEmpty()) {
                        System.out.println("Список дел пуст");
                    } else {
                        for (int i = 0; i < todos.size(); i++) {
                            System.out.println((i + 1) + ". " + todos.get(i));
                        }
                    }
                    break;
                case "ADD":
                    if (parts.length < 2) {
                        System.out.println("Не указана задача на добавление");
                    }
                    if (parts.length == 2) {
                        toDoList.add(parts[1]);
                    } else {
                        try {
                            int index = Integer.parseInt(parts[1]) - 1;
                            String task = parts[2];
                            toDoList.add(index, task);
                        } catch (NumberFormatException e) {
                            toDoList.add(parts[1] + " " + (parts.length > 2 ? parts[2] : ""));
                        }
                    }
                    break;
                case "EDIT":
                    if (parts.length < 3) {
                        System.out.println("Не указана задача на изменение");
                    } else {
                        try {
                            int index = Integer.parseInt(parts[1]) - 1;
                            String editTask = parts[2];
                            toDoList.edit(index, editTask);
                        } catch (NumberFormatException e) {
                            System.out.println("Номер задачи отсутствует");
                        }
                    }
                    break;
                case "DELETE":
                    if (parts.length < 2) {
                        System.out.println("Не указано удаление");
                    } else {
                        try {
                            int index = Integer.parseInt(parts[1]) - 1;
                            toDoList.delete(index);
                        } catch (NumberFormatException e) {
                            System.out.println("Номер задачи на удаление отсутствует");
                        }
                    }
                    break;
                default:
                    System.out.println("Неизвестная команда. Попробуйте еще раз.");
            }
        }
        scanner.close();
    }
}