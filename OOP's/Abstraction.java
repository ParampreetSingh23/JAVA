public class Abstraction {
  public static void main(String[] args) {
    // Horse h = new Horse();
    // h.eat();
    // h.walk();
    // Chiken c = new Chiken();
    // c.eat();
    // c.walk();
  // System.out.println(h.color);
  Mustang myHorse = new Mustang();
    
  }
  
}

abstract class Animal{
  String color;
  void eat(){
    System.out.println("animal eats");

  }
  abstract void walk();
  Animal(){

System.out.println("Animal Constructor");
  }
}

class Horse extends Animal{
  void walk(){
    System.out.println("walks on 4 legs");
  }
  void changeColor(){
    color = "dark brown";
  }
  Horse(){
    System.out.println("Horse Constructor");
  }
}

class Mustang extends Horse{
  Mustang(){
    System.out.println("Mustang Constructor");
  }
}






class Chiken extends Animal{
  void walk(){
    System.out.println("walks on 2 legs");
  }
  void changeColor(){
    color = "Yellow";
  }
}