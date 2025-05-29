package week_2.Day_5;

class secondmaxele{
	public static int secondLargest(int[] arr, int n){
	if(n<2)
	return -1;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	
	for (int i = 0; i < n; i++){
		if (arr[i] > large){
			second_large = large;
			large = arr[i];
		}else if (arr[i] > second_large && arr[i] != large){
			second_large = arr[i];
		}
	}
	return second_large;
}

public static void main(String[] args){
	int[] arr = {5,7,9,1,2,3};
	int n = arr.length;
	
	System.out.println("Second largest is "+secondLargest(arr, n));
    }
}