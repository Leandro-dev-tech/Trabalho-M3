import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a mensagem: ");
        String texto = scanner.nextLine();

        Mensagem mensagem = new MensagemSimples(texto);

        mensagem = new EmojiDecorator(mensagem, "😊");
        mensagem = new AssinaturaDecorator(mensagem, nome);

        System.out.println("\nMensagem final:");
        System.out.println(mensagem.gerar());

        scanner.close();
    }
}
