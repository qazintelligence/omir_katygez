public class Person {
    private static int id_gen = 1;
    private static int id;
    private String name;
    private String surname;


    public Person(){
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
    public Person(String name,String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    @Override
    public String toString(){
        return id+'.'+' '+name+' '+surname;
    }


}
