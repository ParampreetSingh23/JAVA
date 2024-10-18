public class Questions {
  public static void main(String[] args) {
    Students s1 = new Students("Parampreet");
    System.out.println(s1.name);
    s1.setPass(123);
    System.out.println(s1.showPass());
    
  
  }
}
class Students{
  public String name;
  public int age;
  private int password;

  Students(){
    System.out.println("Non parameterized Constructor");
  }
  
  Students(String name){
    this.name = name;
    
  }
  void setPass(int pass){
    this.password = pass;
  }
  int showPass(){
    return this.password;
  }
}
