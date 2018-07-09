package ioc2;

public class Userr {
	// MySqlDAL dal = new MySqlDAL();
	Idal dal;

	// public Userr(int idaltype) {
	// if (idaltype == 1) {
	// dal = new MySqlDAL();
	// } else {
	// dal = new SqlServerDAL();
	// }
	// }

	public Userr(Idal dalType) {
		dal = dalType;
	}

	public boolean isValid() {
		return true;
	}

	public void add() {
		if (isValid()) {
			dal.add(this);
		}
	}
}
