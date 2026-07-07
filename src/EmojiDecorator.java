public class EmojiDecorator extends MensagemDecorator {

    private String emoji;

    public EmojiDecorator(Mensagem mensagem, String emoji) {
        super(mensagem);
        this.emoji = emoji;
    }

    @Override
    public String gerar() {
        return mensagem.gerar() + " " + emoji;
    }
}
