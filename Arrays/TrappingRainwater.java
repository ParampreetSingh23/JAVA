public class TrappingRainwater {
  public static int trappedRainwater(int height[]){
    int n = height.length;
    //calculate left max boundary
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i = 1;i<n;i++){
      leftMax[i] = Math.max(height[i],leftMax[i-1]);
    }
    //calculate Right max boundary
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i = n-2;i>=0;i--){
      rightMax[i] = Math.max(height[i],rightMax[i+1]);
    }
    int trappedRainwater = 0;
    for(int i = 0;i<n;i++){
      int waterLevel = Math.min(leftMax[i],rightMax[i]);
      trappedRainwater += waterLevel - height[i];
    }
    return trappedRainwater;
  }
  public static void main(String[] args) {
    int height[] = {4,2,0,6,3,2,5,11,10,9,1}; 
   
    System.out.print( trappedRainwater(height));
  }
}
