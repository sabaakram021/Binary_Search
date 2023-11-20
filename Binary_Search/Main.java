/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("********Binary Serach using Recursion*********");
        int arr[] = {-1,0,3,5,9,12};
        int target = 9;
        int index = BinarySearch(arr,0,arr.length,target);
        System.out.println("Element found at index : "+ index);
    }
    public static int BinarySearch(int[] arr,int lo,int hi, int target){
        if(lo>hi)return -1;
        int mid = lo+(hi-lo)/2;
        if(arr[mid]==target)return mid;
        else if(arr[mid]<target){
            return BinarySearch(arr,mid+1,hi,target);
        }else{
            return BinarySearch(arr,lo,mid-1,target);
        }
    }
}