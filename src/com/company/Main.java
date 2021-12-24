package com.company;

public class Main {

    public static void main(String[] args) {


        int temperature = 34;
        int numberOfStudents = 19;
        boolean isRainy = true;

        if (temperature > 19 && numberOfStudents == 19) {
            // && - THIS IS an OPERATOR "and"
            System.out.println("The room is stuffy");
        }

        if (temperature < 100 || isRainy) {
            // || THIS IS AN OPERATOR "Or"
            System.out.println("it's pouring like a bucket");
        }

        if (isRainy || numberOfStudents < 10 && temperature > 0) {
            System.out.println("keep distance");
        }


        if (!isRainy) {
            // ! - THIS IS AN OPERATOR "not"
            System.out.println("Rain is not going");
        }

    }
}
