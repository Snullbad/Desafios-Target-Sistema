package Faturamento;

import java.util.Scanner;

public class Faturamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de dias: ");
        int numeroDias = sc.nextInt();

        double[] faturamentoDiario = new double[numeroDias];
        for (int i = 0; i < numeroDias; i++) {
            System.out.print("Digite o faturamento do dia " + (i+1) + ": ");
            faturamentoDiario[i] = sc.nextDouble();
        }
        sc.close();

        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];
        double mediaMensal = 0;
     
        for (int i = 0; i < numeroDias; i++) {
            if (faturamentoDiario[i] < menorFaturamento) {
                menorFaturamento = faturamentoDiario[i];
            }

            if (faturamentoDiario[i] > maiorFaturamento) {
                maiorFaturamento = faturamentoDiario[i];
            }

            mediaMensal += faturamentoDiario[i];
        }
      
        mediaMensal /= numeroDias;
        int diasAcimaDaMedia = 0;
        for (int i = 0; i < numeroDias; i++) {
            if (faturamentoDiario[i] > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
      
        System.out.println("Menor faturamento diário: " + menorFaturamento);
        System.out.println("Maior faturamento diário: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento diário acima da média mensal: " + diasAcimaDaMedia);
    }
}