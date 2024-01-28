public class Student {
    private static int id_gen = 1;
    private static int id;
    private String name;
    private String surname;
    private double gpa;

    public Student() {
        id = id_gen++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;

    }

    public double getGpa() {
        return gpa;
    }

    public Student(String name, String surname, double gpa) {
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }


    @Override
    public String toString() {
        return "Student:"+id+"."+name+" "+ surname;
    }
}
