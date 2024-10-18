import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainofPair {
 public static void main(String[] args) {
     int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}
     };
     Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));

     int ans = 1;
     int lastEnd = pair[0][1];//chain end
     for(int i = 1;i<pair.length;i++){
      if(pair[i][0]>lastEnd){
       ans++;
       lastEnd = pair[i][1];
      }
     }
     System.out.println(ans);
 }
}
