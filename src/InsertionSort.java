public class InsertionSort
{
    void insertionSort(int arr[]) // Complexity O(n^2)
    {
        int n = arr.length;
        for (int i=1;i<n;i++)
        {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    void printAll(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        InsertionSort obj = new InsertionSort();
        int arr[] = {1,10,20,11,23,32};
        obj.insertionSort(arr);
        System.out.println("Printing Sorted Array");
        obj.printAll(arr);
    }
}
