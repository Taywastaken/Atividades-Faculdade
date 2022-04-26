import java.util.Scanner;

public class Exercicio425 {
    public static void main(String[] args) {
        int L, c, d;
        int qtde[][] = new int [50][3];
        String nome[] = new String [50];
        Scanner scan = new Scanner(System.in);


        for(L = 0; L < 50; L++){
            System.out.printf("\n\ndigite nome da ", L + 1, " planta: "); 
            nome[L] = scan.nextLine();
            System.out.printf("\ndigite quantidade em estoque: ");
            qtde[L][0] = scan.nextInt();
            System.out.printf("\ndigite qunatidade ideal: "); 
            qtde[L][1] = scan.nextInt();
            if(qtde[L][0] < qtde[L] [1]){ 
                qtde[L][2] = qtde[L][1] - qtde[L][0];
            }
            else{
                qtde[L][2] = 0;
            }
        }
        System.out.printf("\nTotal de compras\n");
        for(L = 0; L < 5; L++){
            System.out.printf("\n", nome[L] ," - ", qtde[L][2]);
        }
        System.out.printf("\n");
        }
    }
    
