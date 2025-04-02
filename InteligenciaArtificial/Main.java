import java.util.Arrays;
import java.util.Random;

public class AlgoritmoGenetico {
    static final int tamanhoPopulacao = 10;
    static final int tamanhodoCromossomo = 5; // Representação binária de x
    static final int geracoes = 20;
    static final double taxademutacao = 0.1;
    static Random random = new Random();

    // Main
    public static void main(String[] args) {
        int[][] populacao = iniciarPopulacao();
        for (int gen = 0; gen < geracoes; gen++) {
            populacao = evoluir(populacao);
        }
        int[] melhorSolucao = getMelhor(populacao);
        System.out.println("Melhor solução: " + Arrays.toString(melhorSolucao) + " (x = " + decode(melhorSolucao) + ", f(x) = " + fitness(decode(melhorSolucao)) + ")");
    }

    // Inicialização da População
    public static int[][] iniciarPopulacao() {
        int[][] populacao = new int[tamanhoPopulacao][tamanhodoCromossomo]; //Gera uma matriz onde cada linha é um indivíduo e cada coluna é um bit do cromossomo.
        for (int i = 0; i < tamanhoPopulacao; i++) {
            for (int j = 0; j < tamanhodoCromossomo; j++) {
                populacao[i][j] = random.nextInt(2); //Cada bit é inicializado aleatoriamente como 0 ou 1.
            }
        }
        return populacao;
    }

    // Evolução da População
    public static int[][] evoluir(int[][] populacao) {
        int[][] newpopulacao = new int[tamanhoPopulacao][tamanhodoCromossomo];
        for (int i = 0; i < tamanhoPopulacao; i++) {
            int[] parent1 = selecionar(populacao);  //Seleção: Escolhe dois pais com base na aptidão.
            int[] parent2 = selecionar(populacao);
            int[] filho = crossover(parent1, parent2);  //Crossover: Gera um novo indivíduo combinando os pais.
            mutacao(filho); //Mutação: Altera aleatoriamente alguns bits do indivíduo.
            newpopulacao[i] = filho;    //Adiciona o novo indivíduo à nova população.
        }
        return newpopulacao;
    }

    // Seleção
    public static int[] selecionar(int[][] populacao) {
        int totalFitness = Arrays.stream(populacao) // Calcula o fitness total da população.
                .mapToInt(ind -> fitness(decode(ind)))
                .sum();
        
        int rouletteSpin = random.nextInt(totalFitness);    // Gira a roleta para obter um número aleatório entre 0 e o fitness total.
        int FitnessAcumulada = 0;
        
        for (int[] individual : populacao) {    // Percorre os indivíduos acumulando fitness até encontrar aquele que corresponde ao número sorteado.
            FitnessAcumulada += fitness(decode(individual));
            if (FitnessAcumulada > rouletteSpin) {
                return individual;
            }
        }
        return populacao[0]; // Caso extremo, retorna o primeiro
    }

    // Crossover
    public static int[] crossover(int[] parent1, int[] parent2) {
        int crossoverPoint = random.nextInt(tamanhodoCromossomo); //Escolhe um ponto de corte aleatório no cromossomo.
        int[] filho = new int[tamanhodoCromossomo];
        for (int i = 0; i < tamanhodoCromossomo; i++) {
            filho[i] = (i < crossoverPoint) ? parent1[i] : parent2[i]; // A primeira parte do filho vem do pai 1 e a segunda parte do pai 2.
        }
        return filho;
    }

    // Mutação
    public static void mutacao(int[] individual) {
        for (int i = 0; i < tamanhodoCromossomo; i++) {
            if (random.nextDouble() < taxademutacao) {  // Com probabilidade de MUTATION_RATE, inverte (0 vira 1 e vice-versa).
                individual[i] = 1 - individual[i];
            }
        }
    }

    // Função de Aptidão (Fitness)
    public static int fitness(int x) { // O algoritmo buscará valores maiores de x, pois isso maximiza f(x).
        return x * x; // Maximizar f(x) = x^2
    }

    // Decodificação do Cromossomo
    public static int decode(int[] chromosome) {
        int value = 0;
        for (int bit : chromosome) {
            value = (value << 1) | bit; // Converte o array binário para um número decimal.
        }
        return value;
    }

    // Obtendo o Melhor Indivíduo
    public static int[] getMelhor(int[][] populacao) {
        int[] melhor = populacao[0];
        for (int[] individual : populacao) {    // Percorre a população e retorna o indivíduo com maior aptidão.
            if (fitness(decode(individual)) > fitness(decode(melhor))) {
                melhor = individual;
            }
        }
        return melhor;
    }
}
