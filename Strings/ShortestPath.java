public class ShortestPath {
  public static void shortestDist (String str){
    int y = 0;
    int x = 0;
    for(int i = 0;i<str.length();i++){
      char curr = str.charAt(i);
      if(curr == 'N'){
       y++;
      }
      else if(curr == 'S'){
        y--;
      }
      if(curr == 'E'){
        x++;
      }
      if(curr == 'W'){
        x--;
      }
    }
    System.out.println("y "+y+" "+"x"+" "+x);
    int x2 = x*x;
    int y2 = y*y;
    System.out.println((float)Math.sqrt(x2+y2));
  }
  public static void main(String[] args) {
    String str = "NS";
    shortestDist(str);
  }
}
