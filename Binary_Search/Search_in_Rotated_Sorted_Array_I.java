/**
 * Search_in_Rotated_Sorted_Array_I
 */

public class Search_in_Rotated_Sorted_Array_I {
     public static void main(String[] args) {
        int arr[] = {7,8,9,1,2,3,4,5,6};
        int target = 8;
        System.out.println(target+" found at index : "+ findtarget(arr,0,arr.length-1,target));
     }
     public static int findtarget(int[] nums, int lo, int hi, int target ){
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid] == target)return mid;
            else if(nums[mid]>=nums[lo]){
                if(nums[lo]<=target && target<=nums[mid]){
                    hi = mid;
                }else{
                    lo = mid + 1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[hi]){
                    lo = mid;
                }else{
                    hi = mid -1 ;
                }
            }
        }
        return -1;
    }       
}