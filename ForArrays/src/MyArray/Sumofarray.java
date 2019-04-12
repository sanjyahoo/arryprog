package MyArray;

import org.testng.annotations.Test;

// sum of array

public class Sumofarray {  

	@Test
	public void Sum()
	{
		int sum=0;
		int[] a = {1,2,3,4,5};
		System.out.println(a.length);
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum/(a.length));
		}

	
}
