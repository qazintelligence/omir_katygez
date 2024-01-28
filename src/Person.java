public class Person implements Payable,Comparable<Person>{
    private static int id_gen = 1;
    private static int id;
    private String name;
    private String surname;

    Student gpa = new Student();
    double gpaa = gpa.getGpa();


    public Person() {
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

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    @Override
    public String toString() {
        return id + "." + name + " " + surname;
    }

    public String getPosition() {
        return "Student";
    }


    @Override
    public double getPaymentAmount() {
        if (gpaa > 2.67) {
            return 36660.00;
        } else {
            return 0;
        }
    }

    @Override
    public void compareTo() {
    }
}
