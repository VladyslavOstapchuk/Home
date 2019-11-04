package GUI.w12;

public
    class Person {

    private String name;

    public Person(String name) {
        // this.name = name;
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
