import java.util.Scanner;

public class Exercicio440 {
    public static void main(String[] args) {
        Float mat[][] = new Float[12][4];
        Float totalmes, totalano, totalsem;
        int i, j;
        Scanner scan = new Scanner(System.in);


        for(i = 0; i < 12; i++){
            for(j = 0; j < 4; j++){ 
                System.out.printf("\nmes: ",i + 1, " semana: ", j + 1, ": ");
                mat[i][j] = scan.nextFloat();
            }
        }
        totalano = (float) 0;
        for(i = 0; i < 12; i++) { 
            totalmes = (float) 0;
            for(j = 0; j < 4; j++){
                totalmes = totalmes + mat[i][j]; 
            }
            System.out.printf("\ntotal do mes ", i + 1, " = ", totalmes);
            totalano = totalano + totalmes;
        }
        for(j = 0; j <4; j++){ 
            totalsem = (float) 0;
            for(i = 0; i < 12; i++){
                totalsem = totalsem + mat[i][j]; 
            }
            System.out.printf("\ntotal da semana ", j + 1, " = ", totalsem);
        }
        System.out.printf("\n\ntotal do ano = ", totalano);
        System.out.printf("\n");







    }
    
}
