package ru.fomina.testing;

public class User {

    private final String login;
    private final String email;

    public User() {
        this(null, null);
    }

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public void checkEmail(String email) {
        if (!email.contains("@") || !email.contains(".") || email.endsWith(".")) {
            throw new InvalidEmailAddressException("Установлен некорректный e-mail адрес");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
