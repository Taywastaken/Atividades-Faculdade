import java.util.Scanner;

public class Exercicio500 {
    public class VetorMetodos{
        Scanner scan = new Scanner(System.in);
        public int[] entrada(int vet[], int t, String c){
            int L;

            System.out.printf("\nEntrada do VETOR", c);
            for(L = 0; L < t;L++){ 
                System.out.printf("Digite numero: ", L + 1, ": ");
                vet[L] = scan.nextInt();
            }
            return vet;
        }
        public int[] imprime(int vet[], int t, String c){
            int L;

            System.out.printf("\n VETOR ", c, "\n");
            for(L = 0; L < t; L++){ 
                System.out.printf("\n", L+1, vet[L]);
            }
            return (vet);
        }
        public void soma(int vet[], int vet1[], int t){
            int L, s;
            System.out.printf("\nSOMA\n");
            for(L = 0; L < t; L++){ 
                s = vet[L] + vet1[L];
                System.out.printf("\n", s); 
            }
        }
        public void subtrai(int vet[], int vet1[], int t){
            int L, d;
            System.out.printf("\nDIFERENÇA\n");
            for(L = 0; L < t; L++){ 
                d = vet[L] + vet1[L];
                System.out.printf("\n", d); 
            }
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int [5];
        int num1[] = new int [5];
        int L, flag = 0, flag1 = 0, op;
        VetorMetodos metodos = new VetorMetodos();

        for(L = 0; L < 5; L++){ 
            num[L] = 0; 
            num1[L] = 0;
        }
        System.out.printf("\n\n\n");
        System.out.printf("\nVETORES\n");
        System.out.printf("\nl Dados do VETOR A");
        System.out.printf("\n2 Dados do VETOR B");
        System.out.printf("\n3 Imprime VETORES");
        System.out.printf("\n4 Soma VETORES");
        System.out.printf("\n5 Subtrai VETORES");
        System.out.printf("\n6 Sai do programa");
        System.out.printf("\nOPCAO:");
        op = scan.nextInt();
        do{
            switch(op){
                case 1: 
                metodos.entrada(num, 5, "A");
                flag = 1;
                break;

                case 2: 
                metodos.entrada(num1, 5, "B");
                flag1 = 1;
                break;
            
                case 3: 
                if(flag != 0 && flag1 != 0){
                System.out.printf(num, 5, "A"); 
                System.out.printf(num1, 5, "B"); 
                }

                case 4:
                if(flag != 0 && flag1 != 0){ 
                    metodos.soma(num,num1,5) ;
                }
                else{
                    System.out.printf("\nEscolha primeiro opcoes 1 e 2");
                }
                break;

                case 5: 
                if(flag != 0 && flag1 != 0){ 
                    metodos.subtrai(num,num1,5); 
                }
                else{ 
                    System.out.printf("\nEscolha primeiro opcoes 1 e 2");
                }
                break;

                case 6: 
                System.out.printf("\nSaindo do Algoritmo");
                break;

                default: 
                System.out.printf("\nopcao invalida");
            }
        }
        while(op != 6);
        System.out.printf("\n");

        }
    }








    
}
