import java.util.Scanner;

public class Exercicio358 {
    public static void main(String[] args) {
        Float[] precocompra = new Float[100];
        Float[] precovenda = new Float[100];
        Float lucro;
        int totlucromenor10 = 0, totlucromenor20 = 0, totlucromaior20 = 0, A;

        for (A = 0; A < 100; A++){
            System.out.printf("\nPreco de compra: "); 
            Scanner scan = new Scanner(System.in);
            precocompra[A] = scan.nextFloat();
            System.out.printf("\nPreco de venda: "); 
            precovenda [A] = scan.nextFloat();
        }
        for (A = 0; A < 100; A++){
            lucro = precovenda[A] - precocompra[A];
            if (lucro < 10.0){
                totlucromenor10++;
            }
            else {
                if (lucro <= 20.0){
                    totlucromenor20++;
                }
                else{
                    totlucromaior20++;
                }
            }
        }
        System.out.printf("\ntotal de mercadorias com lucro < 10%: ", totlucromenor10);
        System.out.printf("\ntotal de mercadorias com 10% <= lucro 20%:", totlucromenor20);
        System.out.printf("\ntotal de mercadorias com lucro > 20%: ", totlucromaior20);
        System.out.printf("\n");

        
    }
}
