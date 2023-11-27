public class minimum_in_a_sorted_rotated_array {
    public static void main(String[] args) {
        System.out.println("Start");
        int arr[] = {7,8,9,0,2,3,4,5,6};
        
        int mini = findMinimum(arr,0,arr.length-1);
        System.out.println("Minimum in this array is : "+mini);

    }
    public static int findMinimum(int[] nums, int lo, int hi){
        int min = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = lo+(hi - lo)/2;
            if(nums[lo]<=nums[hi]){
                min = Math.min(min,nums[lo]);
                break;
            }
            if(nums[mid]>=nums[lo]){
                min = Math.min(min,nums[lo]);
                lo = mid + 1;
            }else{
                min = Math.min(min,nums[mid]);
                hi = mid -1 ;
            }
        }
        return min;
    }
}
