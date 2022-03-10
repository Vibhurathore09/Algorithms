package Sorting;

public class SelectionSort
{
    void selectionSort(int arr[])
    {
        int n = arr.length;

        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j = i+1 ; j<n; j++)
            {
                if(arr[j]<arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    void printAll(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        SelectionSort obj = new SelectionSort();
        int arr[] = { 9,1,4,3,5};
        obj.selectionSort(arr);
        System.out.println("Printing Sorted Array");
        obj.printAll(arr);
    }
}
