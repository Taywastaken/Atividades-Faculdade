import java.util.Scanner;

public class Exercicio404 {
    public static void main(String[] args) {
        int L, c, t;
        int N[][] = new int[10][10];

        Scanner scan = new Scanner(System.in);
        for(L = 0; L <9; L++){ 
            for(c = 0; c <=9; c++){ 
                System.out.printf("\nEntre com elemento linhab", L + 1, "b-hcolunab ",c + 1, ":b");
                N[L][c] = scan.nextInt();
            }
        }
        System.out.printf("\nACIMA DA DIAGONAL PRINCIPAL\n");
        for(L = 0; L <= 8;L++){
            for(c = L+1;c <= 9;c++){
                System.out.printf("\t", N[L][c]);
            }
            System.out.printf("\n");
            for(t = 0; t <= L; t++){
                System.out.printf("\t");
            }
        }
        System.out.printf("\n");











    }
    
}
