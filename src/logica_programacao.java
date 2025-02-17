import java.util.Scanner;
public class logica_programacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int comprimento;
        int largura;
        int area;


        System.out.print("Digite a largura do retângulo: ");
        largura = scanner.nextInt();


        System.out.print("Digite o comprimento do retângulo: ");
        comprimento = scanner.nextInt();


        area = largura * largura;


        System.out.print("a area do retangulo e:" + area);


        scanner.close();
    }
}