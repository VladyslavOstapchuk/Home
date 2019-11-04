package GUI.w05;

public
    class Student
    implements Comparable<Student>{

    protected String name;
    protected int number;

    public Student(String name, int number){
        this.name = name;
        this.number = number;
    }


    public String toString(){
        return name+" "+number;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("compareTo");
        int res = this.name.compareTo(o.name);
        if(res == 0)
            return this.number - o.number;
        return res;
    }

    public boolean equals(Object o){
        System.out.println("equals");
        if(o == null || this.getClass() != o.getClass())
            return false;
        Student s = (Student) o;
        return this.name.equals(s.name) &&
                this.number == s.number;
    }

    public int hashCode(){
        System.out.println("hashCode");
        return 17*this.name.hashCode()+number;
    }


}
