import java.util.Arrays;
import java.util.Scanner;


public class Exercicio400 {
    public static void main(String[] args){
        int[] leitos = new int [50];
        int[] nd = new int [50];
        int i, k, chave, quarto, op;
        String[] sit = new String [50];
        String[] din = new String [50];
        String[] dout = new String [50];
        String[] nome = new String [50];
        String[] tel = new String [50];
        String resp, respl = " ", respo, nomep;
        Float[] precos = new Float [50];
        Float[] despesas = new Float[50];
        Float valor, total;
        chave = 0;


        System.out.printf("\n\n\nHotel Fazenda Sucesso \n");
        System.out.printf("\nl. Cadastra quartos ");
        System.out.printf("\n2. Lista todos os quartos ");
        System.out.printf("\n3. Lista quartos desocupados ");
        System.out.printf("\n4. Aluguel / reserva quarto ");
        System.out.printf("\nS. Entra despesas extras ");
        System.out.printf("\n6. Calcula despesa do quarto");
        System.out.printf("\n7. Sair");
        System.out.printf("\n8. Opção:");
        Scanner scan = new Scanner(System.in);
        op = scan.nextInt();
        System.out.printf("\n");
 
        if (op == 1){ 
            if (chave ==1){ 
                System.out.printf("\nAtencao. Dados ja cadastrados");
            }
            else{
                for(i = 0; i < 50; i++){
                    System.out.printf("\nquantidade de leitos para o quarto ", i + 1, ": ");
                    leitos[i] = scan.nextInt();
                    System.out.printf("\npreco do quarto: ");
                    precos[i] = scan.nextFloat();
                    sit[i] = "L";
                    nd[i] = 0;
                    despesas[i] = (float) 0;
                    din[i] = " XXXX";
                    dout[i] = " XXXX";
                    nome[i] = " ";
                    tel [i] = " ";
                }
        chave = 1;
            }
        }      
        else{
            if(op==2){
                if(chave == 0){
                    System.out.printf("\nEscolha a opcao 1");
                }
                else{
                    for(i = 0; i < 50; i++){
                        System.out.printf("\nNumero do quarto: ", i + 1, "\n");
                        System.out.printf("\nSituacao quarto: ", sit[i]);
                        if(sit[i]== "A" || sit[i] == "R"){
                            System.out.printf("\nnome: ", nome[i]);
                            System.out.printf("\ntelefone: ", tel[i]);
                        }
                        System.out.printf("\nquantidade de leitos: ", leitos[i]);
                        System.out.printf("\npreco do quarto: ", precos[i]);
                        System.out.printf("\ndespesas: ", despesas[i]);
                        System.out.printf("\ndata de entrada: ", din[i]);
                        System.out.printf("\ndata de saida: ", dout[i]);
                        System.out.printf("\nnuniero de dias: ", nd[i]);
                        System.out.printf("\npressione enter para continuar: ");
                        respo = scan.nextLine();
                        }
                }
            }
            else{
                if(op==3){
                    if(chave ==0){
                        System.out.printf("\nEscolha a opcao 1");
                    }
                    else{
                        for( i = 0; i < 50; i++){
                            if(sit[i] == "A"){
                                System.out.printf("\nnumero do quarto: ", i + 1, "\n");
                                System.out.printf("\ndespesas: ", despesas[i]);
                                System.out.printf("\ndata de entrada: ", din[i]);
                                System.out.printf("\ndata de saida: ", dout[i]);
                                System.out.printf("\nnumero de dias: ", nd[i]);
                                System.out.printf("\npressione enter para continuar: ");
                                resp = scan.nextLine();
                            }
                        }
                    }
                }
                else{ 
                    if(op==4){ 
                        if(chave == 0){ 
                            System.out.printf("\nEscolha a opcao 1");
                        }
                        else{ 
                            System.out.printf("\nDigite A( aluguel) R(reserva): ");
                            resp = scan.nextLine();
                            while(resp.equalsIgnoreCase("A") == false && resp.equalsIgnoreCase("a") == false && resp.equalsIgnoreCase("R") == false && resp.equalsIgnoreCase("r") == false){ 
                                System.out.printf("\nResposta invalida. Digite (aluguel) R(reserva): ");
                                resp = scan.nextLine(); 
                            }
                            if(resp == "A" || resp == "a"){ 
                                System.out.printf("\n Tinha reserva ( s /n)? ");
                                respl = scan.nextLine();
                                if(respl == "S" || respl == "s"){ 
                                    System.out.printf("\nEntre com nome: ");
                                    nomep = scan.nextLine();
                                    i = 0;
                                    while(nomep.equalsIgnoreCase(nome[i]) == false && i < 49){ 
                                        i++;
                                        }
                                    if(nomep == nome[i]){ 
                                        quarto = i; 
                                        sit[i] = "A";
                                        despesas[i] = (float) 0;
                                        System.out.printf("\ndata de entrada: ");
                                        din[quarto] = scan.nextLine();
                                        System.out.printf("\ndata de saida: "); 
                                        dout[quarto] = scan.nextLine();
                                        System.out.printf("\nnumero de dias: ");
                                        nd[quarto] = scan.nextInt();
                                    }
                                    else{ 
                                        System.out.printf("\nReserva nao encontrada ");
                                        respl = "N"; 
                                    }
                                }
                            }
                            if(respl == "N" || respl == "n" || resp=="r" || resp=="R"){ 
                                for(i = 0; i < 50; i++){ 
                                    if(sit[i] == "L"){ 
                                        System.out.printf("\nnumero do quarto: ", i + 1, "\n");
                                        System.out.printf("\nquantidade de leitos: ", leitos[i]);
                                        System.out.printf("\npreco do quarto: ", precos[i]);
                                        System.out.printf("\npressione enter para continuar: ");
                                        respo = scan.nextLine();
                                    }
                                }
                            System.out.printf("\nDigite o numero do quarto para aluguel ou reserva: ");
                            quarto = scan.nextInt();
                            while(quarto < 1 || quarto > 50){
                                System.out.printf("\nQuarto Invalido. Entre novamente: ");
                                quarto = scan.nextInt();
                            }
                            while(sit[quarto-1] == "A"){ 
                                System.out.printf("\nQuarto ocupado. Digite novamente: ");
                                quarto = scan.nextInt();
                            }
                            if(resp == "A" || resp == "a"){ 
                                sit[quarto-1] = "A"; 
                                despesas[quarto -1] = (float) 0;
                            }
                            else{ 
                                sit[quarto -1] = "R"; 
                            }
                            System.out.printf("\nDigite nome: "); 
                            nome[quarto -1] = scan.nextLine();
                            System.out.printf("\nDigite telefone para contato: "); 
                            tel[quarto-1] = scan.nextLine();
                            System.out.printf("\ndata de entrada: "); 
                            din[quarto-1] = scan.nextLine();
                            System.out.printf("\ndata de saida: "); 
                            dout[quarto-1] = scan.nextLine();
                            System.out.printf("\nnumero de dias: ");
                            nd[quarto-1] = scan.nextInt();
                        }
                    else{ 
                        if(op==5){ 
                            if(chave ==0){ 
                                System.out.printf("\nEscolha a opcao 1");
                            }
                        else{ 
                            System.out.printf("\nentre com numero do quarto:");
                            quarto = scan.nextInt();
                            while(quarto < 1 || quarto > 50){ 
                                System.out.printf("\nentre com numero do quarto:");
                                quarto = scan.nextInt();
                            }
                            System.out.printf("\ndespesas: R$");
                            valor = scan.nextFloat();
                            despesas[quarto-1] = despesas[quarto-1]+ valor;
                            }
                        }
                    else{ 
                        if(op==6){ 
                            if(chave ==0){ 
                                System.out.printf("\nEscolha a opcao 1");
                            }
                            else{ 
                                System.out.printf("\nentre com numero do quarto:");
                                quarto = scan.nextInt();
                                while(quarto < 1 || quarto > 50){ 
                                    System.out.printf("\nentre com numero do quarto:");
                                    quarto = scan.nextInt(); 
                                }
                                total = despesas[quarto-1] + precos[quarto-1];
                                System.out.printf("\ndespesas: R$ ", total);
                                sit[quarto-1] = "L";
                                despesas[quarto-1] = (float) 0;
                                din[quarto-1] = "XXXX";
                                dout[quarto-1] = "XXXX";
                                nd[quarto-1] = 0;
                                nome[quarto-1] = " ";
                                }
                            }
                        else{ 
                            if(op==7){ 
                                System.out.printf("\nSaindo ");
                            }
                        else{
                            System.out.printf("\nOpcao nao disponivel");
                        }
                        }
                        while(op != 7){
                            System.out.printf("\n\n");
                            }
                        }
                    }
                }
            }
        }
    }
}
}}
