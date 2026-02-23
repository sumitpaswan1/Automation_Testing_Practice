package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
	
	public static ArrayList<Integer> missing(int[] arr1, int[] arr2) {
		
		int n = arr1.length;
		int m = arr2.length;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<n;i++) {
			set.add(arr1[i]);
		}
		for(int i = 0;i<m;i++) {
			set.add(arr2[i]);
		}
		
	    // Convert the set to an ArrayList and return
	       ArrayList<Integer> list = new ArrayList<>(set);
	       Collections.sort(list);
	       
	       return list;
	    
		
	
	    
	    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr1 = {1,2,3,4};
		 int[] arr2 = {2,3,5,6};
		
		 System.out.println(missing(arr1,arr2));

	}

}
