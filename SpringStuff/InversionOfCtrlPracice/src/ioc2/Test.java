package ioc2;

public class Test {
	public static void main(String[] args) {
		Userr user = new Userr(new MySqlDAL());
		user.add();
	}
}
