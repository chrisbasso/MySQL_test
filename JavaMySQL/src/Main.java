
public class Main {

	public static void main(String[] args) {
		MySQL db = new MySQL();
		try {
			db.MySQLConnection("root", "", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			db.MySQLConnection("root", "", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// db.createDB("MySQL_Test");
		// db.createTable("Registros");

		try {
			db.MySQLConnection("root", "", "MySQL_Test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		db.insertData("Registros", "454", "Juan", "Perez", "20", "M");
		db.insertData("Registros", "453", "Garcia", "Carlos", "24", "M");

		db.getValues("Registros");
	}
}
