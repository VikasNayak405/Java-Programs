import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr1[] = {5,23,11,43,13};
//		char arr2[] = {'r','w','d','g','y','a'};
//		Arrays.sort(arr1,1,4);
//		System.out.print(Arrays.toString(arr1));
//		System.out.println();
//		Arrays.sort(arr2);
//		System.out.print(Arrays.toString(arr2));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(34);
		list.add(32);
		list.add(11);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
