package ioc1;

public class User {
	MySqlDAL dal = new MySqlDAL();

	public boolean isValid() {
		return true;
	}

	public void add() {
		if (isValid()) {
			dal.add(this);
		}
	}
}
