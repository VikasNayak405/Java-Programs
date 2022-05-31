package Sorting_Operations;

public class Bubble_Sort {
	
	//BubbleSort 
	void BubbleSort(int arr[]) {
		int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
	}
	
	//printing the element 
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	//main class
	public static void main(String[] args) {
		Bubble_Sort bs = new Bubble_Sort();
		int arr[] = {23,12,43,1,9,11};
		bs.BubbleSort(arr);
		System.out.println("Sorted Array : ");
		bs.printArray(arr);
	}
	
}
