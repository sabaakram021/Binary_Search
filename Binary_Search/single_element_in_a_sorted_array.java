public class single_element_in_a_sorted_array {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6 };
        int n = arr.length;
        int min_element = findMin(arr, n);
        System.out.println("Mininum element in a sorted rotated array is : "+min_element);
    }

    public static int findMin(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        if(arr[0]!=arr[1])return arr[0];
        if(arr[n-1]!=arr[n-2])return arr[n-1];
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1])
                return arr[mid];
            else if (mid % 2 == 0 && arr[mid] == arr[mid + 1]) {
                lo = mid + 1;
            } else if (mid % 2 == 1 && arr[mid] == arr[mid - 1]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
