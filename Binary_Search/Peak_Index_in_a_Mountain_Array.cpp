#include <iostream>
using namespace std;
int peak(int arr[], int n)
{
    int l = 0, h = n - 1;
    while (l < h)
    {
        int mid = l + (h - l) / 2;
        if (arr[mid] < arr[mid + 1])
        {
            l = mid + 1;
        }
        else
        {
            h = mid;
        }
    }
    return l;
}
int main()
{
    int arr[] = {0, 1, 3, 8, 10, 6, 2, 1};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Index of Peak element is: " << peak(arr, n);
    return 0;
}