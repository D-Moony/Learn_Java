package linearlist;

import java.util.Arrays;

public class LinearList_1 {
	
	//init Resize Array value
	public static final int CHANGE_ARRAY_SIZE_ADD = 1;
	public static final int CHANGE_ARRAY_SIZE_MUL = 2;
	
	public static void main(String[] args) {
		String [] linearArray = {"Moon", "Kim", "Choi"};
		printArray(linearArray);
		linearArray = addData(linearArray, "Park");
		printArray(linearArray);
		linearArray = delData(linearArray);
		printArray(linearArray);
	}
	
	public static void printArray(String[] array) {
		System.out.println("[Print Array]");
		
		if(array == null) {
			System.out.println("(ERROR) : NULL ARRAY");
			return;
		}
	
		for(int i = 0; i < array.length; i++)
			System.out.println("Index[" + i + "] : " + array[i]);
		System.out.println();
		 
	}
	
	public static String[] addData(String[] array, String data, int index) {
		System.out.println("[Add Data]");
		
		if(index < 0) {
			System.out.println("(ERROR) : INDEX");
			return null;
		}
		
		String [] tmpArray = resizeArray(array, '+');
		for(int i = tmpArray.length - 1; i > index; i--) 
			tmpArray[i] = tmpArray[i - 1];
		tmpArray[index] = data;
		System.out.println("(" + index + ") : " + data  + "\n");
		
		return tmpArray;
	}
	
	public static String[] addData(String[] array, String data) {
		System.out.println("[Add Data]");
		
		
		String [] tmpArray = resizeArray(array, '+');
		tmpArray[array.length] = data;
		System.out.println("(" + array.length + ") : " + data  + "\n");
		
		return tmpArray;
	}

	public static String[] delData(String[] array, int index) {
		System.out.println("[Delete Data] -> INDEX");
		
		if(index < 0) {
			System.out.println("(ERROR) : INDEX");
			return null;
		}
		System.out.println("(" + index + ") : Delete");
		for(int i = index; i < array.length - 1; i++) 
			array[i] = array[i + 1];
		return resizeArray(array, '-');
	}
	
	public static String[] delData(String[] array, String data) {
		System.out.println("[Delete Data] -> DATA");
		int index = searchData(array, data);
		
		if(index < 0) {
			System.out.println("(ERROR) : INDEX");
			return null;
		}
		System.out.println("(" + index + ") : Delete" );
		for(int i = index; i < array.length - 1; i++) 
			array[i] = array[i + 1];
		return resizeArray(array, '-');
	}
	
	public static String[] delData(String[] array) {
		System.out.println("[Delete Data] -> INDEX");
		
		System.out.println("(" + (array.length - 1) + ") : Delete");

		return resizeArray(array, '-');
	}
	
	public static int searchData(String[] array, String data) {
		System.out.println("<Search Array>");
		for(int i = 0; i < array.length; i++)
			if(array[i].equals(data)) {
				System.out.println("(" + data + ") : " + i);
				return i;
			}
		System.out.println("(" + data + ") : NULL");
		return -1;
	}
	
	private static String[] resizeArray(String[] array, char op) {
		System.out.println("<RESIZE ARRAY>");
		
		//Check Array length (subtract , division)
		if(array.length < 2 && op == '-') {
			System.out.println("(ERROR) : SUB");
			return null;
		} else if (array.length < 2 && op == '/') {
			System.out.println("(ERROR) : DIV");
			return null;
		}
		
		//return newArray
		if(op == '+') {
			System.out.println(array.length + " + " + CHANGE_ARRAY_SIZE_ADD + " = " + (array.length + CHANGE_ARRAY_SIZE_ADD));
			return Arrays.copyOf(array, array.length + CHANGE_ARRAY_SIZE_ADD);
		}
		else if(op == '-') { 
			System.out.println(array.length + " - " + CHANGE_ARRAY_SIZE_ADD + " = " + (array.length - CHANGE_ARRAY_SIZE_ADD) + "\n");
			return Arrays.copyOf(array, array.length - CHANGE_ARRAY_SIZE_ADD);
		}
		else if(op == '*') {
			System.out.println(array.length + " * " + CHANGE_ARRAY_SIZE_MUL + " = " + (array.length * CHANGE_ARRAY_SIZE_MUL));
			return Arrays.copyOf(array, array.length * CHANGE_ARRAY_SIZE_MUL);
		}
		else if(op == '/') {
			System.out.println(array.length + " / " + CHANGE_ARRAY_SIZE_MUL + " = " + (array.length / CHANGE_ARRAY_SIZE_MUL)+ "\n");
			return Arrays.copyOf(array, array.length / CHANGE_ARRAY_SIZE_MUL);
		}
		else  {
			System.out.println("(ERROR) : UNKNOWN OPCODE");
			return null;
		}
	}

}
