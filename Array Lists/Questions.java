import java.util.*;

public class Questions {
  public static boolean checkMonotonic(ArrayList<Integer> list) {
    if (list.size() <= 1) {
      return true;  // Lists with 0 or 1 elements are always monotonic
  }
  
  boolean increasing = true;
  boolean decreasing = true;
  
  for (int i = 1; i < list.size(); i++) {
      if (list.get(i) < list.get(i - 1)) {
          increasing = false;
      }
      if (list.get(i) > list.get(i - 1)) {
          decreasing = false;
      }
      if (!increasing && !decreasing) {
          return false;  
      }
  }
  
  return true;  
  }
  public static void checkLonelyNumbers(ArrayList<Integer> list){
    
    for(int i = 0;i<list.size();i++){
      int count = 1;
      for(int j = i+1;j<list.size();j++){
        if(list.get(i)==list.get(j)){
          count++;
          break;
        }
      }
      if(count == 1){
        if(i==0 || count == list.size()-1){
          if(list.get(i+1) != (list.get(i)+1)){
            System.out.println(list.get(i));
          }
        }
        else{
          if(list.get(i+1) != (list.get(i)+1) && list.get(i-1) != (list.get(i)-1)){
            System.out.println(list.get(i));
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(6);
    list.add(5);
    list.add(8);
    checkLonelyNumbers(list);

  }
}
