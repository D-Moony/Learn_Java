package javaProject1;

import java.util.Random;

public class TestSearch {

public static void main(String[] args) {
	int numList[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	reverse(numList);
	for(int i = 0; i < numList.length; i++)
		System.out.print(numList[i]);
}
public static int linerSearch(int[] data, int index, int target) {
    if(index < 0)
        return -1;
    else if(data[index] == target)
        return index;
    else
        return linerSearch(data, index - 1, target);
}
/*
		// TODO Auto-generated method stub
		int data[] = new int[10];
		Random ran = new Random(System.currentTimeMillis());
		for(int i = 0; i < data.length - 1; i++)
			data[i] = ran.nextInt();
		System.out.print(linerSearch(data, data.length - 1, data[3]));
		
 */
public static double sqrt(double target, int index) {
	double result = 2;
    for(int i = 0; i < index; i++)
    	result = (result + (target / result)) / 2;
    return result;    
}

public static void reverse(int[] numList) {
	 for (int i = 0, max, temp; i < (numList.length)/2 ; i++) {
         max = numList.length- i -1; 
         temp = numList[i];
         numList[i] = numList[max];
         numList[max] = temp;
     }
}
 
}
