package MyArray;

public class LargestAndSmallest {
public static void main(String[] args) {
	int arr[] = {1,3,2,4,5,6,8,5,8,9};
	int MAX_VALUE = arr[0];
	int MIN_VALUE = arr[0];
	for(int i=0;i<arr.length;i++){
		if(MAX_VALUE<arr[i])  //1<3
		MAX_VALUE=arr[i];//3
	else if(MIN_VALUE>arr[i]){//1>3
		MIN_VALUE=arr[i];
	}
	}
	System.out.println(MAX_VALUE);
	System.out.println(MIN_VALUE);
	}
	
}
