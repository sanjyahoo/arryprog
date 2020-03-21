package MyArray;

public class Ar {

	public void dupe()
	{
	int ar[]={1,1,2,2,3,3,4,4,4,44,44};
	int z=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]!=z)
		{
		for (int j=i+1;j<ar.length;j++)
		{
			if(ar[i]==ar[j] && i!=j)
			{
				System.out.println("Repeating Element :"+ar[i]);
				z=ar[i];
				break;
		
			}
		}
	}
	}
	
}
public static void main(String[] args) {
	Ar ob=new Ar();
	ob.dupe();
}	
}
