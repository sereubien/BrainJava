import java.util.ArrayList;
//import java.util.*;

/**
 * 2018. 5. 9. Dev By JAY
 * 
 * ArrayListTest.java
 */

public class ArrayListTest {

	public static void main(String[] args) {

		
		ArrayList<String> fruits = new ArrayList<String>(3);
		fruits.add("����");
		fruits.add("����");
		fruits.add("������");
		fruits.add("���");
		
/*
		String[] fruits = new String[3];
		fruits[0] = "����";
		fruits[1] = "����";
		fruits[2] = "������";
		fruits[3] = "���";
*/
		System.out.println("���� ���");
		
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		
		fruits.remove(2);
		
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
		
//		System.out.println(fruits.get(0));
//		System.out.println(fruits.get(1));
//		System.out.println(fruits.get(2));
//		System.out.println(fruits.get(3));
		
	}

}
