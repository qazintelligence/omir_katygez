import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void printData(Iterable<Person> ppl){
        for (Person person : ppl){
            System.out.println(person);
        }
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Kairat","Nurtas","high",40650.56);
        Student stud = new Student("Toregali","Toreali",2.5);
        Employee emp2 = new Employee("Tyler","Durden","very high",70000.00);
        Student stud2 =  new Student("Ryan","Gosling",3.5);
        ArrayList<Person> ppl = new ArrayList<>();
        ppl.add(emp);
        ppl.add(stud);
        ppl.add(emp2);
        ppl.add(stud2);
        Collection.sort(ppl);

        printData(ppl);
    }
}
