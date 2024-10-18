public class Inheritance {
  public static void main(String[] args) {
    // Fish shark = new Fish();
    // shark.eat();
    Dog tommy = new Dog();
    tommy.eat();
    tommy.legs = 4;
    System.out.println(tommy.legs);
  }
  
}
//base class
class Animal{
  String color;
  void eat(){
    System.out.println("eats");
  }
  void breathe(){
    System.out.println("breathe");
  }
}
//derived class or subclass
// class Fish extends Animal{
//   int fins;
//   void swim(){
//     System.out.println("swims");
//   }
// }
class Mammals extends Animal{
  int legs;
}
class Dog extends Mammals{
  String breed;
}