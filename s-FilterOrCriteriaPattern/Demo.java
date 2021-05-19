// Structural Pattern 
// Filter Pattern ,or Criteria pattern, 
// 他们允许用不同的标准来过滤一组对象，通过逻辑元素用解耦的方式把它们连接起来
// 结合多个标准获得单一标准
// interface: Criteria ( +meetingCriteria, List<Person>)
// AndCriteria, OrCriteerai (-criteria, + )
import java.util.ArrayList;
import java.util.List;

public class Demo {
  public static void main(String[] args) {

    List<Person> persons = new ArrayList<Person>();
    persons.add(new Person("Robert", "Male", "Single"));
    persons.add(new Person("Robert1", "Female", "Single"));
    persons.add(new Person("Robert2", "Male", "Married"));
    persons.add(new Person("Robert3", "Female", "Single"));
    persons.add(new Person("Robert4", "Female", "Married"));

    Criteria male = new CriteriaMale();
    Criteria female = new CriteriaFemale();
    Criteria single = new CriteriaSingle();

    Criteria singleMale = new AndCriteria(single,male);
    Criteria singleOrFemale = new OrCriteria(single,female);

    System.out.println("Male:");
    printPersons(male.meetCriteria(persons));

    System.out.println("female:");
    printPersons(female.meetCriteria(persons));

    System.out.println("singleMale:");
    printPersons(singleMale.meetCriteria(persons));

    System.out.println("singleOrFemale:");
    printPersons(singleOrFemale.meetCriteria(persons));

  }


  public static void printPersons(List<Person> persons) {
    for (Person person : persons) {
      System.out.println("Person: name, gender, marital Stuats " +
      person.getName() + " " + person.getGender() 
      + " " + person.getMaritalStatus()  + " ");
    }
  }

}
