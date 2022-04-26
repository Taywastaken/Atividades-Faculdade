import java.util.Scanner;
import java.util.Arrays;

public class Exercicio398 {
    public static void main(String[] args){
        int k = 0, codi, codigo, t, i, quantidade, aux;
        int[] cod = new int [50];
        int[] quant = new int [50];
        Float [] preco = new Float[50];
        Float venda = (float) 0, geral, auxp;

        //entrada dos produtos
        System.out.printf("\nDigite o codigo do produto ou O para acabar:");
        Scanner scan = new Scanner(System.in);
        codi = scan.nextInt();


        while(k < 50 && codi != 0){
            cod[k] = codi;
            System.out.printf("\nDigite a quantidade do produto:");
            quant[k] = scan.nextInt();
            System.out.printf("\nDigite o preco do produto:");
            preco[k] = scan.nextFloat();
            k++;
            System.out.printf("\nDigite o codigo do produto ou 0 para acabar: ");
            cod[k] = scan.nextInt();
        }

        //venda dos produtos

        System.out.printf("\nDigite o código do produto a ser vendido:");
        codi = scan.nextInt();
        while (codi != 0) {
            if (Arrays.asList(cod).contains(codi)){
                System.out.printf("\nDigite a quantidade do produto:");
                quantidade = scan.nextInt();
                if(quantidade < quant[codi]){
                    venda = venda + quantidade;
                    quant[codi] = quant[codi] - quantidade;

                }
                else{
                    System.out.printf("\nEstoque Insuficiente!");
                }
            }
            else{
                System.out.printf("\n Produto não cadastrado!");
            }
        }
        //mostrar o estoque ao final
        for (t = 50; t >= 0; t--){
            System.out.printf("\nQuantidade de produtos vendidos: ", venda);
            System.out.printf("\nEstoque do produto", cod[t], ": ", quant[t]);
        }
    }
}
