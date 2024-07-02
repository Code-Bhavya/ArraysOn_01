
package com.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperation {
	
	public static void main(String[] args) {

		String input = "numbers.txt";
		String output = "Multiples.txt";
		createFile(input);
		arrayNumberToFile(input);

		ArrayList<Integer> number = readNumbersToFile(input);
		printNumber(number);

		createFile(output);

		ArrayList<Integer> multiples = findMultiplesOfELement(number);

		writeMultipleNumbersToFile(output, multiples);
		printNumber(multiples);

	}

	public static void createFile(String fileName) {

		File file = new File(fileName);

		try {
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void arrayNumberToFile(String fileName) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> numbers = new ArrayList<>();
		

		System.out.println("Enter numbers :");

		while (true) {
			String input = sc.nextLine();
			if (input.isEmpty()) {
				break;
			}
			numbers.add(input);
		}

		try {
			FileWriter fw = new FileWriter(fileName);
			for (String number : numbers) {
				fw.write(number + " ");
			}
			fw.close();
//			System.out.print("Array elements: " + fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static ArrayList<Integer> readNumbersToFile(String fileName) {
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
				String textElements[] = line.trim().split(" ");
				for(String ele : textElements) {
					list.add(Integer.parseInt(ele));
				}
			}
			System.out.print("Array elements reader: " + fileName);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	public static ArrayList<Integer> findMultiplesOfELement(ArrayList<Integer> numbers) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter multipler of element : ");
		int multy = s.nextInt();
		
		ArrayList<Integer> multiplesList = new ArrayList<>();
		for (int num : numbers) {
			if (num % multy == 0) {
				multiplesList.add(num);
			}
		}
		return multiplesList;
	}

	public static void writeMultipleNumbersToFile(String fileName, ArrayList<Integer> multiples) {
		try {
			FileWriter fw = new FileWriter(fileName);
			for (int num : multiples) {
				fw.write(num + "\n");
			}
			fw.close();
			System.out.println("Element added in file ");
			System.out.println("Multiples : " + fileName);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void printNumber(ArrayList<Integer> number) {
		for (int al : number) {
			System.out.print(" "+al);
		}
        System.out.println();
	}

}
