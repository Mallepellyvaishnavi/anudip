package anudip;

public class DuplicateArray {
public static void main(String args[])
{
	int arr[]= {56,3,56,23,4,7,8,7,7};//declaring array elements
		int count=0;
		//To check the duplicate values in array

	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[j]); //To print duplicate values

				
				count++;
				break;
			}
		}
	}
	System.out.println("count is:"+count);  //To know the count of dupl values

}
}
