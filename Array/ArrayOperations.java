package Array;

public class ArrayOperations {
	
	public static int insert2(int arr[], int n, int pos, int val) {
		int position = pos-1;
		for(int i = n-1; i >= position; i--) {
			arr[i+1] = arr[i];
		}
		arr[position] = val;
		return n+1;
	}
	
	public static int insert(int arr[], int n, int pos, int val) {
		for(int i = n-1; i >= pos-1; i--) {
			arr[i+1] = arr[i];
		}
		arr[pos-1] = val;
		return n+1;
	}
	
	
	//delete an element of an array.
	public static int Delete(int arr[], int n, int val) {
		int i;
		for(i = 0; i < n; i++)
			if(arr[i] == val)
				break;
		if(i < n) {
			for(int j = i; j >= n-1; j--)
				arr[j] = arr[j+1];
			
		}
		return n-1;
	}
	
	
	public static void Display(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + "\t");
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[]  {10,20,30,40,50,0};
		int n = arr.length;
		insert(arr, n, 6, 66);
		Display(arr, n);
	}

}
