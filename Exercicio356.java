import java.util.Scanner;

public class Exercicio356 {
    private static String format;

    public static void main(String[] args) {
        int l, c, t;
        int[] media = new int [15];
        String[] nomes = new String [15];
        String[] sit = new String [15];
        Float[] pr1 = new Float[15];
        Float[] pr2 = new Float[15];

        //entradas dos valores
        for (l = 0; l <= 14; l++) {
            System.out.printf("Digite ", l + 1, " nome: ");
            Scanner scan = new Scanner(System.in);
            nomes[l] = scan.nextLine();

            while (nomes[l].length() > 30){
                System.out.println("Nomes com até 30 caracteres");
                System.out.printf("Digite: ", l + 1, " nome: ");
                nomes[l] = scan.nextLine();
            }
            t = 30 - nomes[l].length();

            for (c = 1; c <= t; c++){
                nomes[l] = nomes[l].concat(" ");
            }
            System.out.println("Digite a Primeira nota: ");
            pr1[l] = scan.nextFloat();

            System.out.println("Digite a Segunda nota: ");
            pr2[l] = scan.nextFloat();

            media[l] = (int) ((pr1[l] + pr2[l])/2+0.0001);
            if (media[l] >= 5){
                sit[l] = "AP";
            }
            else {
                sit[l] = "RP";
            }

        }
        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL\n");
            
        for (l = 0; l <= 14; l++){
            System.out.printf("\n", l + 1, "- ", nomes[l] ,"\t", pr1[l] , "\t", pr2[l], "\t", media[l], "\t", sit[l]);        
        }
        System.out.printf("\n");
        }

    
}
