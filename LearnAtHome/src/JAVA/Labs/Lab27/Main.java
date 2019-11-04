package Basics.Lab27;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        saveInfoAboutPersonsToTxtAsString(createTestPersons(10));
        readInfoAboutPersonsFromTxtAsString();
        saveInfoAboutPersonsToBinAsString(createTestPersons(10));
    }

    //
    public static Person[] createPersons(int count) {
        Person[] people = new Person[count];
        for (int i = 0; i < people.length; i++) {
            people[i] = createPerson();
        }
        return people;
    }

    //
    public static Person createPerson() {
        //
        String name;
        String surname;
        //
        int yearOfBirth;
        short postCode;
        //
        boolean sex;
        //
        System.out.println(
                "\nINPUT DATA IN THIS FORMAT:" +
                        "\n* Name (Text)" +
                        "\n* Surname (Text)" +
                        "\n* Year of birth (Integer)" +
                        "\n* Sex (true(male)/false(female))" +
                        "\n* Post code (Integer)" +
                        "\n");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Name : ");
            name = scanner.nextLine();
            System.out.println("Surname : ");
            surname = scanner.nextLine();
            System.out.println("Year of birth : ");
            yearOfBirth = scanner.nextInt();
            System.out.println("Sex : ");
            sex = scanner.nextBoolean();
            System.out.println("Post code : ");
            postCode = scanner.nextShort();
            return new Person(name, surname, yearOfBirth, postCode, sex);
        } catch (Exception e) {
            try {
                throw new WrongData("FUCK");
            } catch (WrongData w) {
                w.getMessage();
            }
        }
        return createPerson();
    }

    //
    public static Person createTestPerson() {
        return new Person("Vladyslav", "Ostapchuk", 1998, (short) 111, true);
    }

    //
    public static Person[] createTestPersons(int count) {
        Person[] people = new Person[count];
        for (int i = 0; i < people.length; i++) {
            people[i] = createTestPerson();
        }
        return people;
    }

    //
    public static void infoAboutPerson(Person person) {
        System.out.println(person);
    }

    //
    public static void infoAboutPersons(Person[] people) {
        for (Person person : people) {
            infoAboutPerson(person);
        }
    }

    //
    public static void saveInfoAboutPersonsToTxtAsString(Person[] people) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Persons.txt");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < people.length; i++) {
                stringBuilder.append(people[i] + "\n");
            }
            fileWriter.write(stringBuilder.toString());
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //
    public static void readInfoAboutPersonsFromTxtAsString() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Persons.txt");
            Scanner scanner = new Scanner(fileReader);
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
            System.out.println(stringBuilder.toString());
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //
    public static void saveInfoAboutPersonsToBinAsString(Person[] people) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Persons.bin");
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < people.length; i++){
                stringBuilder.append(people[i]+"\n");
            }
            fileOutputStream.write(stringBuilder.toString().getBytes());
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



