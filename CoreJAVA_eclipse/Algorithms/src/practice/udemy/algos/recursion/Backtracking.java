package practice.udemy.algos.recursion;

public class Backtracking {
	int[] A = new int[] { 1, 2, 3,4,5,6,7 };

	public void Binary(int n) {
		if (n < 0) {
			System.out.println(A);
		} else {
			A[n - 1] = 0;
			Binary(n - 1);
			A[n - 1] = 1;
			Binary(n - 1);
		}
	}
	
	public static void main(String args[]){
		Backtracking bt= new Backtracking();
		bt.Binary(5);
	}
}
