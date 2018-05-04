
public class CccInfo {

	public static void main(String[] args) {
		Ccc obj1, obj2;
		obj1 = new Ccc("연흥부", "poorman", "zebi");
		obj2 = new Ccc("연놀부", "richman", "money", "02-000-0000", "타워펠리스");

		printCccInfo(obj1);
		printCccInfo(obj2);
	}

	static void printCccInfo(Ccc obj) {
		System.out.println("이름:" + obj.name);
		System.out.println("아이디:" + obj.id);
		System.out.println("패스워드:" + obj.password);
		System.out.println("전화번호:" + obj.phoneNo);
		System.out.println("주소:" + obj.address);
		System.out.println();
	}

}
