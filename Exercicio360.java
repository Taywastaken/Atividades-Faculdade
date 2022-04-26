import java.util.Scanner;

public class Exercicio360 {
    public static void main(String[] args) {
        int data, i, dia, mes;
        int[] ultdia = new int [12];
        String[] signo = new String [12];
        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 12; i++){
            System.out.printf("Digite o signo: ");
            signo[i] = scan.nextLine();

            System.out.printf("Digite o último dia: ");
            ultdia[i] = scan.nextInt();
        }
        System.out.printf("\nDigite data no formato ddmm ou 9999 para terminar: ");
        data = scan.nextInt();

        while (data != 9999){
            dia = data/100;
            mes = data % 100;
            mes--;
            if (dia > ultdia[mes]){
                mes = (mes + 1) % 12;
            }
            System.out.printf("\nSigno: ", signo[mes], "\n");
            System.out.printf("\nDigite data no formato ddmm ou 9999 para terminar:");
            data = scan.nextInt();
        }

        System.out.printf("\n");
    }
}
