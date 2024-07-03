package com.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class FindUniqueElementHashMap {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 2, 3 };
        System.out.println("Elements in my array : ");
        
        for(int num:arr) {
        	System.out.println(num);
        }
        

        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num :arr) {

        	if(map.containsKey(num)) {
        		map.put(num, map.get(num)+1);
        	}
        	else {
        		map.put(num, 1);
        	}
        }
        
        System.out.println("unique value in my array : ");
        for(Entry<Integer, Integer> m:map.entrySet()) {
        	if(m.getValue()==1) {
        		System.out.println(m.getKey()+" ");
        	}
        	
        }
        
    }
}
