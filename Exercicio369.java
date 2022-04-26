import java.util.Scanner;

public class Exercicio369 {
    public static void main(String[] args){
        int i, lugares, codigo, lugmesa;
        int[] mesa = new int [30];
        int[] qtde = new int [30];

        for (i = 0; i < 30; i++){
            mesa[i] = 100 + i;
            qtde[i] = 5;
        }
        lugares = 150;
        System.out.printf("\nEntre com codigo (100 - 129) ou O para terminar: ");
        Scanner scan = new Scanner(System.in);
        codigo = scan.nextInt();

        while(codigo > 0 && lugares != 0){
            i = 0;
            while(codigo != mesa[i] && i < 29){
                i++;
            }

            if (codigo == mesa[i]){
                System.out.printf("\nQuantidade de lugares a reservar: ");
                lugmesa = scan.nextInt();
                if (qtde[i] >= lugmesa){
                    qtde[i] = qtde[i] - lugmesa; 
                    lugares = lugares - lugmesa; 
                }
                else{
                    System.out.printf("\nNão há lugares para reservar.");
                }
            }
            else{
                System.out.printf("\nCódigo de mesa inválido!");
            }
            System.out.printf("\nEntre com codigo (100 - 129) ou O para terminar: ");
            codigo = scan.nextInt();
        }
        if(lugares == 0){
            System.out.printf("\nLotação Esgotada!");
        }
        else{
            System.out.printf("\nLugares vagos!\n");
            for (i = 0; i < 30; i++){
                if(qtde[i] != 0){
                    System.out.printf("\nmesa: ", mesa[i], " total de lugares: ", qtde[i]);
                }
            }
        }







    }
    
}
