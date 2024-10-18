

public class constructors {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "paramapreet";
    s1.roll = 1088;
    s1.password ="abcd";
    Student s2 = new Student(s1);
    s2.password = "xyz";
  }
}

class Student{
  String name;
  int roll;
  String password;
  int marks[];
  
  Student(String name){
    this.name = name;
  }
  Student(){
    System.out.println("Non parameterized constructor");
  }
  Student(int roll){
    this.roll = roll;
  }
  //copy constructor
  Student(Student s1){
    this.name = s1.name;
    this.roll = s1.roll;
  }

} 