
public class main {

	public static void main(String[] args) {
		String a="thien";
		String s="select * from \"user\" where username='" + a + "'";
		System.out.println(s);

	}

}
