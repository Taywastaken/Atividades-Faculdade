import java.util.Scanner;


public class Exercicio435 {
    public static void main(String[] args) {
        int L,c;
        int n[][] = new int[5][5];
        Scanner scan = new Scanner(System.in);
        
        for(L = 0; L < 5; L++){
            for(c = 0; c < 5; c++){
                System.out.printf("digite elemento de N[", L+1 , "][", c+1, "]: ");
                n[L][c] = scan.nextInt();
                
                //Entra com o número da coluna
                System.out.printf("\nDigite número da coluna(1-5) ou 999 para acabar: ");
                c = scan.nextInt();
                while(c != 999 ){
                    while(c < 1 || c > 5 ){
                        System.out.printf("\nDigite número da coluna entre 1 - 5: ");
                        c = scan.nextInt();
                    }
                c = c + 1;
                System.out.printf("\n Coluna: ", c + 1, "\n");
                for(L = 0; L < 5; c++){
                    System.out.println(n[L][c]); 
                }
                System.out.printf("\nDigite número da coluna(1-5) ou —999 para acabar: ");
                c = scan.nextInt();
                }
                System.out.printf("\n");
            }
        }
    }
}


    
