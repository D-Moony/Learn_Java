package javaProject1;

public class JavaVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean what;
		
		char gul;
		
		byte num1;	short num2; int num3; 	long num4;
		
		float sil1;	double sil2;
		
		/* Boolean�� ���� �׽�Ʈ*/
		what = true;
		System.out.println(what);
		what = false;
		System.out.println(what);
		System.out.println(8<3);	//8<3�� ���������� false ���
		System.out.println(8>3);	//8>3�� ���̹Ƿ� true ���
		
		/* char�� ���� �׽�Ʈ*/
		gul = 0xAE20;	//�����ڵ� �̿��� ���� ����
		System.out.println(gul);
		gul = '��';	//'�� �̿��� ���� ����
		System.out.println(gul);
		
		/* ������ ���� �׽�Ʈ*/
		num1 = 127;	//byte�� ���� -128~127 (1byte)
		System.out.println(num1);
		num2 = 32767;	//short�� ���� -32768~32767 (2byte)
		System.out.println(num2);
		num3 = 2147483647;	//int�� ���� - (4byte)
		System.out.println(num3);
		num4 = 9223372036854775807L;	//long�� ���� - (4byte) ���� �ڿ� L�� �ٿ������ (���̻�)
		System.out.println(num4);
		
		/* �Ǽ��� ���� �׽�Ʈ*/
		sil1 = 11.1f;	//float (4byte) ���� �� f�� �ٿ������ (���̻�)
		System.out.println(sil1);
		sil2 = 33.3;	//double (8byte)
		System.out.println(sil2);
		sil2 = 1.2e-3;	//�Ǽ� e ǥ��� 1.2 * 10^-3 
		System.out.println(sil2);
		sil2 = 1.2e+3;	//�Ǽ� e ǥ��� 1.2 * 10^3 = 1.2e3
		System.out.println(sil2);
	}

}
