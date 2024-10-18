public class Practice {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        
        return uniqueIndex + 1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,4,4,5};
        removeDuplicates(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}