import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Processo {
    int PID; // Identificador de Processo
    int TP; // Tempo de Processamento total
    int CP; // Contador de Programa
    String EP; // Estado do Processo
    int NES; // Número de vezes que realizou uma operação de E/S
    int N_CPU; // Número de vezes que usou a CPU

    Processo(int PID, int TP) {
        this.PID = PID;
        this.TP = TP;
        this.CP = 0;
        this.EP = "PRONTO";
        this.NES = 0;
        this.N_CPU = 0;
    }

    void executar() {
        int quantum = 1000;
        int ciclosExecutados = 0;
        Random rand = new Random();

        while (CP < TP) {
            if (ciclosExecutados == quantum) {
                // Troca de Contexto
                EP = "PRONTO";
                salvarDadosEmArquivo();
                System.out.println("Processo " + PID + " >>>> PRONTO");
                return;
            }

            // Simula 5% de chances de E/S
            if (rand.nextInt(100) < 5) {
                EP = "BLOQUEADO";
                NES++;
                salvarDadosEmArquivo();
                System.out.println("Processo " + PID + " >>>> BLOQUEADO");
                // Simula 30% de chances de sair do estado de BLOQUEADO
                if (rand.nextInt(100) < 30) {
                    EP = "PRONTO";
                    System.out.println("Processo " + PID + " >>>> PRONTO");
                }
                return;
            }

            // Simula a execução de uma instrução
            CP++;
            ciclosExecutados++;
            N_CPU++;
        }

        // Processo terminou sua execução
        EP = "TERMINADO";
        salvarDadosEmArquivo();
        System.out.println("Processo " + PID + " >>>> TERMINADO");
    }

    void salvarDadosEmArquivo() {
        try {
            FileWriter writer = new FileWriter("tabela_processos.txt", true);
            writer.write("PID: " + PID + ", TP: " + TP + ", CP: " + CP + ", EP: " + EP + ", NES: " + NES + ", N_CPU: " + N_CPU + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
