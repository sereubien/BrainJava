/** 2018. 5. 1. Dev By JAY
 * 
 * Bbb.java
 */

/**
 * @author kosea_1class_22
 *
 */
public class Bbb {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		if (++num1 > 0 || ++num2 > 0)
			System.out.println("num1�� 0���� ũ�ų� num2�� 0���� Ů�ϴ�");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		int a = 20, b = 30, max;
		max = a < b ? a : b;
		System.out.println(max);
		System.out.println(a);
		System.out.println(b);

	}

}
