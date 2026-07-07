public class AssinaturaDecorator extends MensagemDecorator {
    
    private String nome;

    public AssinaturaDecorator(Mensagem mensagem, String nome) {
        super(mensagem);
        this.nome = nome;
    }

    @Override
    public String gerar() {
        return mensagem.gerar() + "\n-- Enviado por " + nome;
    }
}
