import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objetodeleitura = new Scanner(System.in);
        imprimir(args[0]);
        imprimir(args[1]);
        imprimir("Informe o nome");
        String nome = objetodeleitura.nextLine();
        imprimir( nome + ", Bem vindo a " + args[0]);
        objetodeleitura.close();
    }

    private static void imprimir(String valor) {
        System.out.println(valor);

        }
    }