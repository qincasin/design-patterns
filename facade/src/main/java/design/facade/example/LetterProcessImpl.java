package design.facade.example;

public class LetterProcessImpl implements ILetterProcess {
    public void writeContext(String context) {
        System.out.println("填写信的内容：" + context);
    }

    public void fillEnvelope(String address) {

        System.out.println("填写信封："+address);
    }

    public void letterInotoEnvelope() {
        System.out.println("将信放进信封中....");

    }

    public void sendLetter() {
        System.out.println("邮局邮寄...");

    }
}
