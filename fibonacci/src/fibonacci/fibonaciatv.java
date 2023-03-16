package fibonacci;

import java.util.Scanner;

public class fibonaciatv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();
      

        boolean pertenceFibonacci = verificaFibonacci(numero);
        if (pertenceFibonacci) {
            System.out.println(numero + " pertence à sequencia de Fibonacci");
        } else {
            System.out.println(numero + " não pertence à sequencia de Fibonacci");
        }
    }

    public static boolean verificaFibonacci(int numero) {
        
        int primeiro = 0;
        int segundo = 1;

        
        if (numero == 0 || numero == 1) {
            return true;
        }

        // Enquanto o próximo número da sequência de Fibonacci for menor ou igual ao número informado, continua o cálculo da sequência
        while (segundo <= numero) {
            // Verifica se o número informado pertence à sequência de Fibonacci
            if (segundo == numero) {
                return true;
            }

            // Calcula o próximo número da sequência de Fibonacci
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
              return false;
        // Se o número informado não pertencer à sequência de Fibonacci, retorna falso
        
       
    }
}

	