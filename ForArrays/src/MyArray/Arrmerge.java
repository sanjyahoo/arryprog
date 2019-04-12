package MyArray;

public class Arrmerge {

	public void Merge()
	{
	int a[] = {1,2,3,4,5};
	int m=a.length;
	int b[] = {6,7,8};
	int n= b.length;
	int[] c = new int[m+n];
	
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	for(int j=0;j<b.length;j++)
	{
		c[m+j]=b[j];
	}	
	for (int k=0;k<c.length;k++)
	{
	System.out.println(c[k]);
	}
	}
	}
