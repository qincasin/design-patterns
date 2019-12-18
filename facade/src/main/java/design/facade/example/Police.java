package design.facade.example;

/**
 * 信件检查类
 */
public class Police {
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + " 检查通过了 ....");
    }
}
