import java.util.*;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
   
    @Override
    public int compareTo(Person p) {
        
        return name.compareTo(p.name);
    }
}
   
    class AgeComparator implements Comparator<Person> {
       // @Override
        public int compare(Person person1, Person person2) {
            if(person1.age>person2.age){
              return 1;
            }
           else if(person1.age<person2.age){
              return -1;
            }
          else {
            return 0;
          }
        }
    }


class PersonDemo {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++){
        persons.add(new Person(sc.next(),sc.nextInt()));
      }
      
      System.out.println("Sorted list according to Age");
      Collections.sort(persons, new AgeComparator());
      for(Person p : persons){
        System.out.println(p.name+" "+p.age);
      }

      System.out.println("Sorted list according to Name");
      Collections.sort(persons);
      for(Person p : persons){
        System.out.println(p.name+" "+p.age);
      }
    }
}