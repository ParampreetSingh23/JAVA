import java.util.ArrayList;

public class KthLargestOddNumInagivenRange {
 public static int largestOdd(int range[], int k) {
  ArrayList<Integer> list = new ArrayList<>();
  int l = range[0];
  int r = range[1];
  for (int i = l; i <= r; i++) {
   if (i % 2 != 0) {
    list.add(i);
   }
  }
  if (k > list.size() || k <= 0) {
   return 0;
  }
  return list.get(list.size() - k);

 }

 public static int optimisedSol(int range[], int K) {
  if (K <= 0)
   return 0;

  int L = range[0];
  int R = range[1];
  if ((R & 1) > 0) {
   int Count = (int) Math.ceil((R - L + 1) / 2);
   if (K > Count)
    return 0;
   else
    return (R - 2 * K + 2);
  } else {
   int Count = (R - L + 1) / 2;
   if (K > Count)
    return 0;
   else
    return (R - 2 * K + 1);
  }
 }

 public static void main(String[] args) {
  int range[] = { -10, 5 };
  int K = 6;
  System.out.println(largestOdd(range, K));
  System.out.println(optimisedSol(range, K));
 }
}
