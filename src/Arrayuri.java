import java.util.*;

public class Arrayuri {
	public static void main(String args[]) {
		int sum = 0;
		int s = 0;
		int s2 = 0;
		int s3 = 0;
		int counter2 = 1;
		int[] Array = new int[] { 2, 12, 45, 1, 34, 7, 56 }; // declaram array-ul
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]); // afisam array-ul
		}
		System.out.println("");
		for (int i = Array.length - 1; i >= 0; i--) { // afisam array-ul invers
			System.out.println(Array[i]);
		}
		System.out.println("");
		for (int k = 0; k < Array.length; k++) { // printare integrii impari
			if (Array[k] % 2 != 0) {
				System.out.println(Array[k]);
			}
		}
		System.out.println("");
		for (int counter = 0; counter < Array.length; counter++) { // printare integrii divizibili cu 3
			if (Array[counter] % 3 == 0) {
				System.out.println(Array[counter]);
			}
		}
		System.out.println("");
		for (int i = 0; i < Array.length; i++) { // suma elementelor din array
			sum += Array[i];
		}
		System.out.println("Suma este:" + sum);
		System.out.println("");
		for (int i = 0; i < 4; i++) {
			s += Array[i];
		}
		System.out.println("Suma primilor 4 integrii este:" + s); // suma primilor 4 integrii din array
		System.out.println("");
		Arrays.sort(Array); // sortam array-ul
		System.out.println("Arrayul sortat este:");
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]); // afisare array sortat
		}
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			s2 += Array[i];
		}
		System.out.println("Suma primilor 5 integrii este:" + s2); // suma ultimilor 5 integrii din array--am sortat
																	// intai array-ul

		System.out.println("");
		for (int i = 0; i < Array.length; i++) {
			s3 += Array[i];
			if (s3 <= 10)
				counter2++;

		}
		System.out.println("Numarul integrilor necesari pentru ca suma lor sa fie mai mare decat 10 este:" + counter2);
		System.out.println("");
		int[] Array2 = new int[] { 23, 5, 75, 21, 77, 3, 64, 7 };
		int max3 = 0;
		int max2 = 0;
		int max = 0;
		for (int i = 0; i < Array2.length; i++) {
			if (max <= Array2[i]) {
				max = Array2[i];
			}
		}
		for (int i = 0; i < Array2.length; i++) {
			if (max2 < Array2[i] && max2 < max) {
				max2 = Array2[i];
			}
		}
		for (int i = 0; i < Array2.length; i++) {
			if (max3 < Array2[i] && max3 < max2) {
				max3 = Array2[i];
			}
		}
		System.out.println("Al treilea cel mai mare element este:" + max3);
		System.out.println("");

	}

	static int compareWithElements(int[] Array, int x) {
		int counter3 = 0;
		x = 34;
		for (int i = 0; i < Array.length; i++) {
			if (x == Array[i]) {
				counter3++;
			}
		}
		return counter3;
	}

	static int MaxInteger(int[] Array, int max) { // metoda care returneaza maximul dintr-un array
		max = 0;
		for (int i = 0; i < Array.length; i++) {
			if (max < Array[i])
				max = Array[i];
		}
		return max;
	}

	static int MinInteger(int[] Array, int min) {
		min = 99999;
		for (int i = 0; i < Array.length; i++) {
			if (min > Array[i])
				min = Array[i];

		}
		return min;
	}

/*static int SumOfMinAndMax(int sum) {
		MinInteger(min);
		MaxInteger(max);
		sum = max + min;
		return sum;
	}*/
}
