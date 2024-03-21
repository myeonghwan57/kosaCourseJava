package ch08.check.Q7;

public class DaoExample {
	public static void dbWork(DataAccessOBject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
