package Pattern;

public class pattern {

	
	public static void leftSideTriangle(int n) {
		for(int a = 0; a < n; a++) {
			for(int b = 0; b <= a; b++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void rightSideTriangle(int n) {
		for(int a = 0; a < n; a++) {
			for(int b = 2*(n-a); b >= 0; b--) 
				System.out.print(" ");
			for(int b = 0; b <= a; b++) 
				System.out.print(" *");
			System.out.println();
		}
	}
	
	public static void pyramid(int n) {
		for(int a = 0; a < n; a++) {
			for(int b = n-a; b >= 1; b--)
				System.out.print(" ");
			for(int b = 0; b <= a; b++)
				System.out.print("* ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		leftSideTriangle(n);
		System.out.println();
		rightSideTriangle(n);
		System.out.println();
		pyramid(n);
	}

}
