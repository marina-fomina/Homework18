package ru.fomina.testing;

public class Main {
    public static void main(String[] args) {
        User user = new User("Ivan", "ivan.12@gmail.com");
        user.checkEmail(user.getEmail());
        System.out.println(user.getEmail().indexOf('@'));
    }
}