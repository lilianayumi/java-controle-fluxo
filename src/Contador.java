import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int primeiroParametro = lerParametro(terminal, "Digite o primeiro parâmetro");
        int segundoParametro =  lerParametro(terminal, "Digite o segundo parâmetro");
        
        try {
            contar(primeiroParametro, segundoParametro);
            terminal.close();
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    private static int lerParametro(Scanner terminal, String mensagem) {
        System.out.println(mensagem);
        return terminal.nextInt();
    }

    private static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoParametro - primeiroParametro;
        System.out.println("Imprimindo os números...");
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
