import java.util.Arrays;

public class SubArraySum {
  public static void printSubArray(int arr[]){
    for(int i = 0;i<arr.length;i++){
      int start = i;
      for(int j = i;j<arr.length;j++){
        int end = j;
        for(int k = start ; k<end;k++){
          System.out.print(arr[k]+" ");
        }
        System.out.println();
      }
     
    }

  }
  public static void subArraySumI(int arr[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length;i++){
      int start = i;
      for(int j = i;j<arr.length;j++){
        int end = j;
        currSum = 0;
        for(int k = start ; k<=end;k++){
          //subarray sum
          currSum+=arr[k];
        }
        System.out.println(currSum);
        if(maxSum<currSum){
          maxSum = currSum;
        }
      
      }
     
    }
    System.out.println("Max Sum is :"+maxSum);

  }
  public static void prefixSumSubarray(int arr[])
{
  int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];
    //calculate prefix array
    prefix[0]= arr[0];
    for(int i = 1;i<prefix.length;i++ ){
      prefix[i] = prefix[i-1]+arr[i];
    }
    for(int i = 0;i<arr.length;i++){
      int start = i;
      for(int j = i;j<arr.length;j++){
        int end = j;
        currSum = start ==0 ? prefix[end]: prefix[end]-prefix[start-1];
       
        System.out.println(currSum);
        if(maxSum<currSum){
          maxSum = currSum;
        }
      
      }
     
    }
    System.out.println("Max Sum is :"+maxSum);

  }
  public static void kadanesAlgo(int arr[])
  {
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i = 0;i<arr.length;i++){
      cs+=arr[i];
      if(cs<0)
      {
        cs= 0;
      }
      ms = Math.max(cs,ms);
    }
    if(ms == 0){
        ms = Arrays.stream(arr).max().getAsInt();
    }
    System.out.println(ms);
  }

  public static void main(String[] args){
    int arr[] = {1,2,93,4,-5};
    int arr2[] ={-1,-2,-3,-4,-5};
    int arr3[] = {100,101,34,2,5,6,102};
    // printSubArray(arr3);
    // subArraySumI(arr);
    prefixSumSubarray(arr3);
    // kadanesAlgo(arr3);
  } 
}
