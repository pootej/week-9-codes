import java.util.ArrayList;
import java.util.*;
class Student implements Comparable<Student>{
  private int id;
  private String name;
  private String dept;
  private int age;

  Student (int id, String name, String dept, int age){
    this.id=id;
    this.name=name;
    this.dept=dept;
    this.age=age;
  }
  public int compareTo(Student st){
    if(id<st.id){
      return 1;
    }
    else if(id<st.id){
      return -1;
    }
    else{
      return 0;
    }
  }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
  
}

class StudentDemo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> students=new ArrayList<Student>();
    for(int i=0;i<2;i++){
      students.add(new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextInt()));
    }
    Collections.sort(students);
    for(Student st:students){
      System.out.println(st.getId()+" "+ st.getName()+" "+ st.getDept()+" "+ st.getAge());
    }
  }
}