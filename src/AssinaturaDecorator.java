public class AssinaturaDecorator implements Mensagem {
    private Mensagem mensagem;
    private String nome;

    public AssinaturaDecorator(Mensagem mensagem, String nome) {
        this.mensagem = mensagem;
        this.nome = nome;
    }

    @Override
    public String gerar() {
        return mensagem.gerar() + "\n-- Enviado por " + nome;
    }
}
