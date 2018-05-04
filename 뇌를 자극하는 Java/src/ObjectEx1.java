/** 2018. 5. 2. Dev By JAY
 * 
 * ObjectEx1.java
 */

/**
 * @author kosea_1class_22
 *
 */
public class ObjectEx1 {

	public static void main(String[] args) {

		/*
		 * StringBuffer obj; obj = new StringBuffer("Hey, Java");
		 */

		StringBuffer obj = new StringBuffer("Hey, Java");
		obj.deleteCharAt(1);
		obj.deleteCharAt(1);
		obj.insert(1, 'i');
		System.out.println(obj);

		obj.replace(0, 2, "Hello");
		System.out.println(obj);

		obj.reverse();

		System.out.println(obj);

		int length = obj.length();
		System.out.println("문자열 " + obj + "의 길이는 " + length);

	}

}
