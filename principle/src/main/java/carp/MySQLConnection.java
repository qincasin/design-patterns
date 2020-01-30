package carp;

/**
 * Created by qincasin on 2020/1/30.
 */
public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "MySql 数据库连接";
    }
}
