package Sorting_Operations;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int arr[] = {23,12,43,1,9,11};
		sort.Sort(arr);
		System.out.println("Sorted Array : ");
		sort.printList(arr);

	}
	
	public static void Sort(int arr[]) {
		int n = arr.length;
		int i,j,low;
		for(i = 0; i < n-1; i++) {
			low = i;
			for(j = i+1; j < n; j++) 
				if(arr[low] > arr[j])
					low = j;
			int temp = arr[low];
			arr[low] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	public static void printList(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n;  i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
