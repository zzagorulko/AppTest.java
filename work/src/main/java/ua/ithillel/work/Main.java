package ua.ithillel.work;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {

            methodA();

            try {
                System.out.println("help");
            } finally {

            }

            User user = null;

            user.getEmail();

            int value;

            try {
                value = Integer.valueOf("10");
            } catch (NumberFormatException e) {
                value = 666;
            }

            /*int[] array = new int[5];

            int a = array[6];

            System.out.println("Done!");*/

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Opps...");
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException | MyException e) {
            e.printStackTrace();
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }

    public static void methodC() {
        methodD();
    }

    public static void methodD() {
        try {
            methodQ();
        } catch (ArithmeticException e) {
            throw new MyException("Error!", e);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static void methodQ() {
        methodW();
    }

    public static void methodW() {
        methodE();
    }

    public static void methodE() {
        methodR();
    }

    public static void methodR() {

        int a = 10 / (int) Math.random();

        methodT();

    }

    public static void methodT() {
        methodY();
    }

    public static void methodY() {
        System.out.println("Done!");
    }

}
