
import java.util.*;
public class Sorting {
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
    System.out.print("Sorting Array");
    int arr[]={17,48,3,1,2,5,2,16};
    //bubble sort
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
      printarray(arr);
}}
