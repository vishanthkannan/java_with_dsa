import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		int a1 = 0;
		int a2 = 0;

		while(a1 < n && a2 < m){
			if(arr1.get(a1).equals(arr2.get(a2))){
				arr.add(arr1.get(a1));
				a1++;
				a2++;
			}
			else if(arr1.get(a1) < arr2.get(a2)){
				a1++;
			}
			else{
				a2++;
			}
		}
	return arr;
	}
}
