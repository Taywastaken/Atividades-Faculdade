import java.util.Scanner;

public class Exercicio412 {
    public static void main(String[] args) {
        int L, c, t;
        int n[][] = new int[5][5];
        Scanner scan = new Scanner(System.in);

        for(L = 0; L < 5; L++){ 
            for(c = 0; c < 5; c++){ 
                System.out.printf("\ndigite elemento ", L+1, " - ", c+1, " : ");
                n[L][c] = scan.nextInt();
            }
        }
        System.out.printf("\nToda a matriz\n");
        for(L = 0; L < 5; L++){
            for(c = 0; c < 5; c++){
                System.out.println(n[L][c]); 
            }
            System.out.printf("\n");
        }
        System.out.printf("\noSo os elementos nas posicoes cuja num par \n ");
        for(L = 0; L < 5; L++){
            for(c = 0; c < 5; c++){
                if((L + c) % 2 == 0){ 
                    System.out.println(n[L][c]);
                }
                System.out.printf("\t");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");








    }
    
}
