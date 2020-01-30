package carp;

/**
 * Created by qincasin on 2020/1/30.
 */

public class ProductDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println(conn);
    }
}
