package ua.ithillel.work;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class User {

    private final String name;

    private String email;

    private char[] fullName;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(String name, char[] fullName) {
        this.name = name;
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getFullName() throws FileNotFoundException {
        char[] copy = new char[fullName.length];
        System.arraycopy(fullName, 0, copy, 0, fullName.length);
        return copy;
    }

    public void setFullName(char[] fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return (object instanceof User user)
                && Objects.equals(this.name, user.name);
    }

}
