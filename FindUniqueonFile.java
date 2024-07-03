package com.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class FindUniqueonFile {

	public static void main(String[] args) {
		ArrayList<Integer> number = readNumbersToFile();
		printNumber(number);

		ArrayList<Integer> uniques = findUniqueElements(number);

		printNumber(uniques);

	}

	private static ArrayList<Integer> readNumbersToFile() {
		String fileName = "C:\\Users\\Karandeep\\eclipse-workspace\\BhavyaCode\\Testing\\Unique.txt"
				+ "";

		File file = new File(fileName);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		FileReader r = null;
		try {
			r = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(r);

		String line;
		try {
			while ((line = br.readLine()) != null) {
				String textElements[] = line.trim().split(",");
				for (String ele : textElements) {
					list.add(Integer.parseInt(ele));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("elements in my array : ");
		return list;

	}

	
	public static ArrayList<Integer> findUniqueElements(ArrayList<Integer> arr) {


		ArrayList<Integer> multiplesList = new ArrayList<>();
		int count=0;
		System.out.println("Unique elements are:");
		for (int i = 0; i < arr.size(); i++) {
			count = 0;

			for (int j = 0; j < i; j++) {
				  if (arr.get(i).equals(arr.get(j))) {
	                    count++;
	                    break;
	                }
			}
			if(count==0) {
			    int uniqueCount = 0;
                for (int k = i + 1; k < arr.size(); k++) {
                    if (arr.get(i).equals(arr.get(k))) {
                        uniqueCount++;
                        break;
                    }
                }
                if (uniqueCount == 0) {
                    multiplesList.add(arr.get(i));
                }
			}
			}
		return multiplesList;
	}
	
	
	public static void printNumber(ArrayList<Integer> number) {
		for (int al : number) {
			System.out.print( al+" ");
		}
		System.out.println();
	}

}
