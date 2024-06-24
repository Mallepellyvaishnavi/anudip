package anudip;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {7,1,5,43,56};//intializing an array
        int n=arr.length;
        for (int i = 0; i < n ; i++) //
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        
        System.out.println("sorted array:"+arr[i]);//printing sorted elements
        }
}
}
