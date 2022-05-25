package ua.ithillel.work;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Student extends User {
    public Student(String name, String email) {
        super(name, email);
    }

    public Student(String name, char[] fullName) {
        super(name, fullName);
    }

    @Override
    public char[] getFullName() throws FileNotFoundException, ArithmeticException {
        return super.getFullName();
    }

}
