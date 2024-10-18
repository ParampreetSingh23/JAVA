

public class ClassesAndObjects {
  public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    // System.out.println(p1.color);
    // p1.setColor("orange");
    // System.out.println(p1.color);
    // BankAccount myAcc = new BankAccount();
    // myAcc.username = "pamma";
  }
}
class Pen {
 private String color;
 private int tip;

  void setColor(String newColor){
    color = newColor;
  }
  String getColor(){
    return this.color;
  }
  
  void setTip(int newTip){
    tip = newTip;
  }
}
class Student{
  String name;
  int age;
  float percentage;

  void calcPercentage(int phy,int chem,int math){
    percentage = (phy+math+chem)/3;
  }
}
class BankAccount{
  public String username;
  private String password;
  public void setPwd(String pwd){
    password= pwd;
  }

  
}