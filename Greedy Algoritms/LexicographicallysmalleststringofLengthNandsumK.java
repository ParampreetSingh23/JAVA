
public class LexicographicallysmalleststringofLengthNandsumK {
 public static String getSmallestString(int n,int k){
   char c[] = new char[n];
   for(int i = c.length-1;i>=0;i--){
    int val = Math.min(26,k-i);
    c[i] = (char)('a'+val-1);
     k-=val;
   }
   return  new String(c);
 }
 public static void main(String[] args) {
     int n = 3, k = 45;
     System.out.println(getSmallestString(n, k));

 }
}
