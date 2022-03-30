package Sorting;

import java.util.Scanner;

public class InsertionSort
{
    void insertionSort(int arr[]) // Complexity O(n^2)
    {
        int n = arr.length;
        for (int i=1;i<n;i++)
        {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]<temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    void printAll(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        InsertionSort obj = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter elements" );
        for(int i=0 ; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        obj.insertionSort(arr);
        System.out.println("Printing Sorted Array");
        obj.printAll(arr);
    }
}
