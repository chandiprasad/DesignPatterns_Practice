package practice.udemy.algos.recursion;

public class TowersOfHanoi {
	
	public static void main(String args[]){
		towersOfHanoi(3,1,2,3);
	}
	public static void towersOfHanoi(int n,int x,int y,int z){
		//Move the top n disks from tower x to tower y.
		if(n >= 1) {
			towersOfHanoi(n-1,x,y,z);
			System.out.println(String.format("Move top disk from tower %s to top of tower %s ",x,y));
			towersOfHanoi(n-1,z,y,x);
		}
		
	}
}
