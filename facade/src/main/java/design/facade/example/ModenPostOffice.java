package design.facade.example;

/**
 * 现代化的 邮局
 */
public class ModenPostOffice {
    ILetterProcess letter = new LetterProcessImpl();
    Police police = new Police();

    public void sendLetter(String context, String address) {
        letter.writeContext(context);
        letter.fillEnvelope(address);
        police.checkLetter(letter);
        letter.letterInotoEnvelope();
        letter.sendLetter();
    }
}
