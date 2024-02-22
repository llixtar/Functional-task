package app.model;

import java.util.Arrays;
import java.util.List;

import app.entity.User;

public class AppUsersModel {
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Yaroslav", "050 576 38 36"),
                new User("Max", "093 258 32 78"),
                new User("Tanya", "097 005 83 12"),
                new User("Sergiy", "099 742 56 00"),
                new User("Kira", "067 901 00 12")
        );
    }
}
