package ioc2;

public class SqlServerDAL implements Idal {

	@Override
	public void add(Userr user) {
		System.out.println("Adding user to sqlsever............");
	}

}
