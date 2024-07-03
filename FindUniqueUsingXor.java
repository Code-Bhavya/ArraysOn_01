package com.Test;

public class FindUniqueUsingXor {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 2, 3 };
        int ans=0;
       for(int i=0;i<arr.length;i++) {
    	   ans = ans^arr[i];
       }
       
       for(int j=0;j<arr.length;j++) {
    	   if(arr[j]!=ans) {
    		   System.out.println(arr[j]);
    	   }
       }
    }
   
}
