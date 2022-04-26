

public class Exercicio445 {
    public static void main(String[] args) {
        int maior, menor, x, y;
        int mat[][] = new int[5][5];
        int a[] = new int[5];
        int b[] = new int[5];
        
        
        for(x = 0; x < 5; x++){
            for(y = 0; y < 5; y++){ 
                System.out.printf("\ndigite elemento ", x + 1, "-", y + 1,": "); 
                System.out.println(mat[x][y]); 
            }
        }
        //trecho de selecao dos menores e maiores elementos das colunas 
        for(y = 0; y < 5; y++){
            maior = mat[0][y];
            menor = mat[0][y];
            for(x = 0; x < 5; x++){
                if(mat[x][y] > maior){ 
                    maior = mat [x][y]; 
                }
                else{ 
                    if(mat[x][y] < menor){
                        menor = mat[x][y];
                    }
                }
            }
            a[y] = maior;
            b[y] = menor;
        }
        System.out.printf("\nToda a matriz\n");
        for(x = 0; x < 5; x++){
            for(y = 0; y < 5; y++){
                System.out.println(mat[x][y]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\nMaiores elementos das colunas\n");
        for(y = 0; y < 5; y++){ 
            System.out.println(a[y]);
        }
        System.out.printf("\n\nMenores elementos das colunas");
        for(y = 0; y < 5; y++){ 
            System.out.println(b[y]);
        }
        System.out.printf("\n\n Exibindo o resultado\n");
        for(y = 0; y < 5; y++){ 

            System.out.println((a[y] + b[y])/2);
        }
        System.out.printf("\n");












    }
    
}
