package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class DemoPrime {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			int lower = 0, high = 1000;
			int array[][] = Utility.print2DArrayPrime(lower, high);
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++)
					System.out.printf("%4s ", array[i][j] + " ");
				System.out.println();
			}

		}
	}

