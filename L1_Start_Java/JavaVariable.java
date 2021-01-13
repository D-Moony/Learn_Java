package javaProject1;

public class JavaVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean what;
		
		char gul;
		
		byte num1;	short num2; int num3; 	long num4;
		
		float sil1;	double sil2;
		
		/* Boolean형 변수 테스트*/
		what = true;
		System.out.println(what);
		what = false;
		System.out.println(what);
		System.out.println(8<3);	//8<3이 거짓이으로 false 출력
		System.out.println(8>3);	//8>3이 참이므로 true 출력
		
		/* char형 변수 테스트*/
		gul = 0xAE20;	//유니코드 이용한 문자 대입
		System.out.println(gul);
		gul = '안';	//'를 이용한 문자 대입
		System.out.println(gul);
		
		/* 정수형 변수 테스트*/
		num1 = 127;	//byte형 범위 -128~127 (1byte)
		System.out.println(num1);
		num2 = 32767;	//short형 범위 -32768~32767 (2byte)
		System.out.println(num2);
		num3 = 2147483647;	//int형 범위 - (4byte)
		System.out.println(num3);
		num4 = 9223372036854775807L;	//long형 범위 - (4byte) 숫자 뒤에 L을 붙여줘야함 (접미사)
		System.out.println(num4);
		
		/* 실수형 변수 테스트*/
		sil1 = 11.1f;	//float (4byte) 숫자 뒤 f를 붙여줘야함 (접미사)
		System.out.println(sil1);
		sil2 = 33.3;	//double (8byte)
		System.out.println(sil2);
		sil2 = 1.2e-3;	//실수 e 표기법 1.2 * 10^-3 
		System.out.println(sil2);
		sil2 = 1.2e+3;	//실수 e 표기법 1.2 * 10^3 = 1.2e3
		System.out.println(sil2);
	}

}
