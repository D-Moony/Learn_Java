package javaClass;

import java.util.StringTokenizer;

public class JavaStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I was tea!";
		
		StringTokenizer st = new StringTokenizer(str,"a");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
