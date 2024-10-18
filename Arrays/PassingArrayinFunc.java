

public class PassingArrayinFunc {
  public static void incMark(int marks[]){
    for(int i = 0;i<marks.length;i++){
      marks[i] = marks[i]+100;
    }
  }
 public static void main(String[] args) {
  int marks[] = {100,200,300};
  incMark(marks);
  for(int i = 0;i<marks.length;i++){
    System.out.print(marks[i]+" "); 
  }
 } 
}
