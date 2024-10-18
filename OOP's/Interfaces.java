public class Interfaces {
  public static void main(String[] args) {
    // Queen q= new Queen();
    // q.moves();
    Bear b = new Bear();
    b.eatsMeat();
    b.eatsPlants();
  }
}
interface chessPlayer{
  void moves();
}
class Queen implements chessPlayer{
  public void moves(){
    System.out.println("Moves in all direction");
  }
}
class Rook implements chessPlayer{
  public void moves(){
    System.out.println("Up Down Left Right");
  }
}
class King implements chessPlayer{
  public void moves(){
    System.out.println("Up down left right diagonal only one step");
  }
}
//multiple intheriteance 
interface Herbivore{
  void eatsPlants();
}
interface Carnivore{
  void eatsMeat();
}
class Bear implements Herbivore,Carnivore{
  public void eatsPlants(){
    System.out.println("Eats Plants and is a herbivore");
  }
  public void eatsMeat(){
    System.out.println("Eats Meat and is a Carnivore");
  }
}
