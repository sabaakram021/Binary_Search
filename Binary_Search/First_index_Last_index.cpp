#include <iostream>
using namespace std;
// first Index of key//
int firstIndex(int arr[], int l, int h, int key)
{
    int res = -1;
    while (l <= h)
    {
        int mid = l + (h - l) / 2;
        if (arr[mid] == key)
        {
            res = mid;
            h = mid - 1;
        }
        else if (arr[mid] < key)
        {
            l = mid + 1;
        }
        else
        {
            h = mid - 1;
        }
    }
    return res;
}
// Last Index of key//
int lastIndex(int arr[], int l, int h, int key)
{
    int res = -1;
    while (l <= h)
    {
        int mid = l + (h - l) / 2;
        if (arr[mid] == key)
        {
            res = mid;
            l = mid + 1;
        }
        else if (arr[mid] < key)
        {
            l = mid + 1;
        }
        else
        {
            h = mid - 1;
        }
    }
    return res;
}
int main()
{
    int arr[] = {1, 3, 5, 5, 5, 5, 37, 104, 135};
    int n = sizeof(arr) / sizeof(arr[0]);

    cout << firstIndex(arr, 0, n - 1, 5);
    cout << endl;
    cout << lastIndex(arr, 0, n - 1, 5);

    return 0;
}