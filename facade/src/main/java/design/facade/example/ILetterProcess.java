package design.facade.example;

/**
 * 写信过程的接口
 */
public interface ILetterProcess {

    //写信的内容
    void writeContext(String context);
    //写信封
    void fillEnvelope(String address);
    //信放在信封里面
    void letterInotoEnvelope();

    //邮局投递
    void sendLetter();
}
