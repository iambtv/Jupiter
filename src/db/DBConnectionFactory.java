package db;
import db.mongodb.MongoDBConnection;
import db.mysql.MySQLConnection;
public class DBConnectionFactory {
	//private static final String DEFAULT_DB = "mongodb";

	private static final String DEFAULT_DB = "mysql";

	public static DBConnection getDBConnection(String db) {
		switch (db) {
		case "mysql":
			//return null; // return new MySQLConnection();
			return new MySQLConnection();

		case "mongodb":
			return new MongoDBConnection(); // return new MongoDBConnection();
		default:
			throw new IllegalArgumentException("Invalid db" + db);
		}
	}

	public static DBConnection getDBConnection() {
		return getDBConnection(DEFAULT_DB);
	}


}