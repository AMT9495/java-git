package day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arr_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[] {100,20,200,40,90};
		for(var n : numbers)
			System.out.println(n);
		
		
		int[] copyArr1 = Arrays.copyOf(numbers, numbers.length);
		
		System.out.println("CopyArray : " + Arrays.toString(copyArr1));
		
		int[] copyArr2 = Arrays.copyOfRange(numbers,1,3);
		
		System.out.println("CopyArray2 : "+ Arrays.toString(copyArr2));
		
		System.out.println("numbers == copyArr1 :" + Arrays.equals(numbers, copyArr1));
		
		System.out.println("copyarr1 == copyarr2 :" + Arrays.equals(copyArr1, copyArr2));
		
		Arrays.sort(numbers);
		System.out.println("Sorted : "+Arrays.toString(numbers));
		
		System.out.println("Is 90?" + Arrays.binarySearch(numbers, 90));
		
		System.out.println("Is 300?"+ Arrays.binarySearch(numbers, 300));
		
		Arrays.fill(copyArr1, 7);
		
		System.out.println("After filling 7 : " + Arrays.toString(copyArr1));
 	}

}
