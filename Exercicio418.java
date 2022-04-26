import java.util.Scanner;

public class Exercicio418 {
    public static void main(String[] args) {
        int A[][] = new int [4][4];
        int B[][] = new int [4][4];
        int SOMA[][] = new int [4][4];
        int L, c;
        Scanner scan = new Scanner(System.in);
        
        for(L = 0; L < 4; L++){
            for(c = 0; c < 4; c++){
                System.out.printf("digite elemento de A[", L +1, " ][", c+1, "]: ");
                A[L][c] = scan.nextInt();
            }
        }
        for(L = 0; L < 4; L++){
            for(c = 0; c < 4; c++){
                System.out.printf("digite elemento de B[", L +1," ][", c+1, "]:");
                B[L][c] = scan.nextInt();
                SOMA[L][c] = A[L][c] + B[L][c];
            }
        }
        System.out.printf("\n\tMATRIZ SOMA\n");
        for(L = 0; L < 4; L++){
            for (c = 0; c < 4; c++){
                System.out.printf("\t", SOMA[L][c]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    
    
    
    
    
    
    
    }
    
}
