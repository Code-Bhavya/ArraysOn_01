package com.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Multiples {
	public static void multiple() {
		int array[] = new int[] { 0, -11, -6, 2, 5, 6, 7, 8, 9 };
		int num = 3;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % num == 0) {
				System.out.println("multiples of " + num + ": " + array[i]);
				count++;
			}
		}

		System.out.println("I have " + count + " multiples in my given array");

	}

	public static void main(String[] args) {

//		arrayElementsMultiples();
//
//		arrayELementsSizeList();
//		
//		arrayElementsNOSize();

		arrayElementsWithUserChoice();

	}

	private static void arrayElementsWithUserChoice() {
		int mul=2;
		ArrayList<Integer> list = new ArrayList<Integer>();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			String userElements;

			while (true) {
				System.out.println("Enter the elements of an array : ");
				userElements = bf.readLine();
				
					if (userElements.isEmpty()) {
						break;
					}

				try {
					int num = Integer.parseInt(userElements);
					list.add(num);
					
				}catch(Exception e) {
				System.out.println("Invalid input");
				}

			}
			
			for(int arr:list) {
				if(arr%mul==0) {
					System.out.println("Multiples of "+mul+"is : "+arr);
					
				}
			}
			
			
			
            			
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void arrayElementsNOSize() {
		Scanner sc = new Scanner(System.in);
		int num = 2;
		int index = 0;
		int count = 0;
		int arrayElements;
		int oldArray[] = new int[2];

		while (true) {
			System.out.println("Enter the " + (index + 1) + " Element in array : ");
			arrayElements = sc.nextInt();
			index++;

			if (oldArray.length == count) {

				int newArray[] = new int[oldArray.length * 2];

				for (int i = 0; i < oldArray.length; i++) {
					newArray[i] = oldArray[i];
				}

				oldArray = newArray;
			}
			oldArray[count] = arrayElements;
			count++;

			System.out.println(count + ",");

			System.out.println("Enter '0' :" + "to stop adding element in an array");
			if (arrayElements == 0)
				break;
		}

		System.out.println("Array elements : " + Arrays.toString(oldArray));

		for (int i = 0; i < count; i++) {
			if (oldArray[i] % num == 0)
				System.out.println("Multiples of " + num + ": " + oldArray[i]);
		}

	}

	private static void arrayELementsSizeList() {
		Scanner sc = new Scanner(System.in);
		int arrayEle;
		int num = 3;
		int index = 0;
		ArrayList<Integer> array = new ArrayList<>();
		while (true) {
			System.out.println("enter the " + (index + 1) + " element :");
			arrayEle = sc.nextInt();
			array.add(arrayEle);
			index++;
			System.out.println("Enter '0' :" + "to stop adding element in an array");
			if (arrayEle == 0)
				break;

		}

		System.out.println("ArrayList Element : " + array);

		for (int list : array) {
			if (list % num == 0)
				System.out.println("Multiples of " + num + ": " + list);
		}

	}

	public static void arrayElementsMultiples() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();
		int array[] = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("enter the " + (i + 1) + " first element");
			array[i] = sc.nextInt();
		}

		int num = 2;
		for (int arr : array) {
			if (arr % num == 0)
				System.out.println("multiples of " + num + ": " + arr);

		}

	}

}
