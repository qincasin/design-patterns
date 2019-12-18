package design.facade.example;

/**
 * 门面模式 也叫做外观模式
 * 提供一个高层次的接口，使得子系统更容易于使用
 */
public class Client {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        String context = "hi its my letter....";
        String address = "this is my post address ...";
        modenPostOffice.sendLetter(context,address);

    }
}

