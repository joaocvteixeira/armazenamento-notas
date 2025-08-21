import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double[] notasDosAlunos = new double[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notasDosAlunos.length; i++) {
            while (true) {
                System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    notasDosAlunos[i] = scanner.nextDouble();
                    break; 
                } else {
                    System.out.println("Essa nota não pode ser inserida, tente digitar um número.");
                    scanner.next();
                }
            }
        }

        double maiorNota = notasDosAlunos[0];
        for (int i = 1; i < notasDosAlunos.length; i++) {
            if (notasDosAlunos[i] > maiorNota) {
                maiorNota = notasDosAlunos[i];
            }
        }

        System.out.println("A maior nota é: " + maiorNota);
        scanner.close();
    }
}
