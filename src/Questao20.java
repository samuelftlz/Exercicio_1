import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto voce ganha por hora: ");
        double dinheiro =scanner.nextDouble();
        System.out.print("Voce trabalha quantas horas por mes: ");
        double horas = scanner.nextDouble();
        double salario = dinheiro * horas;
        double salarioBruto = salario;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - (impostoRenda + inss + sindicato);
        
        System.out.println("------------------------------");
        System.out.println("         Resultados           ");
        System.out.println("------------------------------");
        System.out.println("Descrição             | Valor");
        System.out.println("------------------------------");
        System.out.printf("Salário Bruto         | R$%.2f%n", salarioBruto);
        System.out.printf("Desconto IR (11%%)     | R$%.2f%n", impostoRenda);
        System.out.printf("Desconto INSS (8%%)    | R$%.2f%n", inss);
        System.out.printf("Desconto Sindicato (5%%)| R$%.2f%n", sindicato);
        System.out.println("------------------------------");
        System.out.printf("Salário Líquido       | R$%.2f%n", salarioLiquido);
        System.out.println("------------------------------");
    }
}