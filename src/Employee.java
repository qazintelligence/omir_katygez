public class Employee extends Person {
    private static int id_gen = 1;
    private static int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    public Employee(){
        id= id_gen++;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public Employee(String name,String surname,String position,double salary){
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public String toString(){
        return "Employee:"+id+"."+name+" "+surname;
    }
}
