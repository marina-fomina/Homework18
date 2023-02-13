package ru.fomina.testing;

public class User {

    private final String login;
    private final String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User() {
        this(null, null);
    }
}
