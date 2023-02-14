package ru.fomina.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    @DisplayName("When 'Marina, 123@gmail.com' passed then User with two parameters is created")
    public void createUserWithParameters() {
        User user = new User("Marina", "123@gmail.com");
        assertNotNull(user.getLogin(), "User with two parameters should be created");
        assertNotNull(user.getEmail(), "User with two parameters should be created");
    }

    @Test
    @DisplayName("When nothing is passed then User without parameters is created")
    public void createUserWithoutParameters() {
        User actual = new User();
        assertNull(actual.getLogin(), "User without parameters should be created");
        assertNull(actual.getEmail(), "User without parameters should be created");
    }

    @Test
    @DisplayName("When email doesn't contain @ or dot then exception throws")
    public void invalidEmailTest() {
        User actual = new User("Ivan", "ivan.gmail.com");
        assertThrows(InvalidEmailAddressException.class, () -> {
            actual.checkEmail(actual.getEmail());
        });
    }

    @Test
    @DisplayName("When login and email are not equal then test will pass")
    public void loginAndEmailNotEqual() {
        User user = new User("Ivan", "ivan12@gmail.com");
        assertNotEquals(user.getLogin(), user.getEmail());
    }
}
