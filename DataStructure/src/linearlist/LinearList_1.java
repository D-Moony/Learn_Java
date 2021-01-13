package linearlist;

import java.util.Arrays;

public class LinearList_1 {
	
	//배열 사이즈 조정시 필요한 상수 정의
	//기본 배열 덧셈 뺄셈 값 1
	public static final int CHANGE_ARRAY_SIZE_ADD = 1;
	//기본 배열 곱셈 나눗셈 값 2
	public static final int CHANGE_ARRAY_SIZE_MUL = 2;
	
	public static void main(String[] args) {
		//새로운 선형리스트(배열) 생성 및 출력
		String [] linearArray = {"Moon", "Kim", "Choi"};
		printArray(linearArray);
		
		//addData메소드로 배열의 마지막에 "Park" 추가 및 배열 출력
		linearArray = addData(linearArray, "Park");
		printArray(linearArray);
		
		//delData메소드로 배열의 마지막 데이터 삭제 및 배열 출력
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
		
		//배열의 크기를 CHANGE_ARRAY_SIZE_ADD만큼 늘려준다.
		String [] tmpArray = resizeArray(array, '+');
		
		//index 이후의 데이터를 한 칸씩 뒤로 민다.
		for(int i = tmpArray.length - 1; i > index; i--) 
			tmpArray[i] = tmpArray[i - 1];
		
		//index에 data를 넣어준다.
		tmpArray[index] = data;
		System.out.println("(" + index + ") : " + data  + "\n");
		
		return tmpArray;
	}
	
	//addData Overload
	//인덱스가 없을 경우, 맨 뒤에 추가
	public static String[] addData(String[] array, String data) {
		System.out.println("[Add Data]");
		
		String [] tmpArray = resizeArray(array, '+');
		tmpArray[array.length] = data;
		System.out.println("(" + array.length + ") : " + data  + "\n");
		
		return tmpArray;
	}

	//delData Overload
	//index로 데이터 삭제
	public static String[] delData(String[] array, int index) {
		System.out.println("[Delete Data] -> INDEX");
		
		if(index < 0) {
			System.out.println("(ERROR) : INDEX");
			return null;
		}
		
		System.out.println("(" + index + ") : Delete");
		
		//index부터 max_index까지 앞으로 한 칸씩 당긴다.
		for(int i = index; i < array.length - 1; i++) 
			array[i] = array[i + 1];
		
		//배열의 사이즈를 하나 줄이고 반환한다.
		return resizeArray(array, '-');
	}
	
	//delData Overload
	//data로 데이터 삭제
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
	
	//delData Overload
	//맨 뒤의 데이터 삭제
	public static String[] delData(String[] array) {
		System.out.println("[Delete Data] -> INDEX");
		
		System.out.println("(" + (array.length - 1) + ") : Delete");

		return resizeArray(array, '-');
	}
	
	//데이터를 입력받아 인덱스를 반환
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
