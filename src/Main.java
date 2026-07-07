import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a mensagem:");
        String texto = scanner.nextLine();

        Mensagem mensagem = new MensagemSimples(texto);
        Mensagem mensagemComAssinatura = new AssinaturaDecorator(mensagem, nome);

        System.out.println();
        System.out.println("Mensagem final:");
        System.out.println(mensagemComAssinatura.gerar());

        scanner.close();
    }
}
