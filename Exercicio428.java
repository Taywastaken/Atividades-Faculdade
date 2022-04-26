import java.util.Scanner;

public class Exercicio428 {
    public static void main(String[] args) {
        int L,codigo,pos,aux;
        int dados[][] = new int [10][4];
        Scanner scan = new Scanner(System.in);
               
        for(L = 0; L<10; L++){ 
            System.out.printf("\ndigite matricula no formato aascccnnn: ");
            dados[L][0] = scan.nextInt();
            aux = dados[L][0]/1000000; 
            aux = dados[L][0] - aux * 1000000;
            dados [L][2] = aux/1000;
            System.out.printf("\ndigite sexo (0 fem 1 masc): "); 
            dados[L][1] = scan.nextInt();
            System.out.printf("\ndigite CR do aluno: ");
            dados [L][3] = scan.nextInt();
        }
        System.out.printf("\ndigite codigo do curso: ");
        codigo = scan.nextInt();
        pos = 0; //posicao inexistente
        for(L = 0; L < 10; L++){
            if(dados[L][2] == codigo && dados[L][1] == 0){
                pos = L;
            } 
            else{
                if(dados[L][3] > dados[pos][3]){
                pos = L;
                }
            }
        }
        System.out.printf("\nAluna premiada matricula: ", dados[pos][0], " teve CR: ", dados[pos][3]);
        System.out.printf("\n");
    }
}
