package Basics.Lab27;

public class Person {
    //
    String name;
    String surname;
    //
    int yearOfBirth;
    short postCode;
    //
    boolean sex;

    //////////////////////////////////

    //
    public Person(String name, String surname, int yearOfBirth, short postCode, boolean sex) {
        setName(name);
        setSurname(surname);
        setYearOfBirth(yearOfBirth);
        setPostCode(postCode);
        setSex(sex);
    }

    //////////////////////////////////

    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    //
    public short getPostCode() {
        return postCode;
    }

    public void setPostCode(short postCode) {
        this.postCode = postCode;
    }

    //
    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    //////////////////////////////////

    //
    @Override
    public String toString() {
        return "\nName = " + getName() +
                ";\nSurname = " + getSurname() +
                ";\nYear of birth = " + getYearOfBirth() +
                ";\nSex = " + (isSex() ? "male" : "female") +
                ";\nPost code = " + getPostCode() +
                ";";
    }


}
