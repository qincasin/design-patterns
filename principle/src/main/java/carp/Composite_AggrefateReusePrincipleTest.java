package carp;

/**
 * Created by qincasin on 2020/1/30.
 * 合成复用原则：尽量使用对象组合(has-a)/聚合(contains-a)，而不是继承关系达到软件服用的目的。
 * 这样可以是系统更加灵活，降低类与类之间的耦合度，一个类的变化对其他类造成的影响相对较少
 *
 * 继承叫做白箱复用，相当于把所有的实现的细节暴露给子类；
 * 组合/聚合称为黑箱复用，我们是无法获得到类之外的对象的实现细节的
 *
 * 现在以数据库操作为例
 */
public class Composite_AggrefateReusePrincipleTest {
    public static void main(String[] args) {
        MySQLConnection mySQLConnection = new MySQLConnection();
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(mySQLConnection);
        productDao.addProduct();
        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();
    }
}
