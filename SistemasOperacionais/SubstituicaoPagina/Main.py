import random

# Criação das matrizes
MATRIZ_SWAP = [[i, i+1, random.randint(1, 50), 0, 0, random.randint(100, 9999)] for i in range(100)]
MATRIZ_RAM = [MATRIZ_SWAP[random.randint(0, 99)].copy() for _ in range(10)]

# Variáveis globais para os algoritmos
indice_fifo = 0
indice_relogio = 0

# Função para imprimir as matrizes
def printarMatriz(matriz):
    print("N\tI\tD\tR\tM\tT")
    for linha in matriz:
        print("\t".join(str(x) for x in linha))

# Função para executar uma instrução
def executaInstrucao(instrucao):
    global MATRIZ_RAM
    for pagina in MATRIZ_RAM:
        if pagina[1] == instrucao:
            pagina[3] = 1
            if random.random() < 0.3:
                pagina[2] += 1
                pagina[4] = 1
            return
    # Se a instrução não está na RAM, substitua uma página
    substitui_pagina(instrucao)

# Função para substituir uma página usando o algoritmo NRU
def substitui_paginaFIFO():
    global MATRIZ_RAM, MATRIZ_SWAP
    min_r_m = min(pagina[3:5] for pagina in MATRIZ_RAM)
    for i in range(len(MATRIZ_RAM)):
        if MATRIZ_RAM[i][3:5] == min_r_m:
            # Substitua a página
            MATRIZ_SWAP[MATRIZ_RAM[i][0]] = MATRIZ_RAM[i]
            MATRIZ_RAM[i] = MATRIZ_SWAP[random.randint(0, 99)].copy()
            return

# Função para substituir uma página usando o algoritmo FIFO
def substitui_paginaFIFO():
    global MATRIZ_RAM, MATRIZ_SWAP, indice_fifo
    # Substitua a página no índice atual do FIFO
    MATRIZ_SWAP[MATRIZ_RAM[indice_fifo][0]] = MATRIZ_RAM[indice_fifo]
    MATRIZ_RAM[indice_fifo] = MATRIZ_SWAP[random.randint(0, 99)].copy()
    # Atualize o índice do FIFO
    indice_fifo = (indice_fifo + 1) % len(MATRIZ_RAM)

# Função para substituir uma página usando o algoritmo RELÓGIO
def substitui_paginaCLOCK():
    global MATRIZ_RAM, MATRIZ_SWAP, indice_relogio
    while True:
        if MATRIZ_RAM[indice_relogio][3] == 0:
            # Substitua a página
            MATRIZ_SWAP[MATRIZ_RAM[indice_relogio][0]] = MATRIZ_RAM[indice_relogio]
            MATRIZ_RAM[indice_relogio] = MATRIZ_SWAP[random.randint(0, 99)].copy()
            return
        # Caso contrário, defina R = 0 e avance o índice
        MATRIZ_RAM[indice_relogio][3] = 0
        indice_relogio = (indice_relogio + 1) % len(MATRIZ_RAM)

# Função para substituir uma página usando o algoritmo FIFO-SC
def substitui_paginaFIFOSC():
    global MATRIZ_RAM, MATRIZ_SWAP, indice_fifo
    while True:
        if MATRIZ_RAM[indice_fifo][3] == 0:
            # Substitua a página no índice atual do FIFO
            MATRIZ_SWAP[MATRIZ_RAM[indice_fifo][0]] = MATRIZ_RAM[indice_fifo]
            MATRIZ_RAM[indice_fifo] = MATRIZ_SWAP[random.randint(0, 99)].copy()
            indice_fifo = (indice_fifo + 1) % len(MATRIZ_RAM)
            return
        else:
            # Segunda chance à página e avance o índice
            MATRIZ_RAM[indice_fifo][3] = 0
            indice_fifo = (indice_fifo + 1) % len(MATRIZ_RAM)

# Função para substituir uma página usando o algoritmo WS-CLOCK
def substitui_pagina_ws_clock():
    global MATRIZ_RAM, MATRIZ_SWAP, indice_relogio
    EP = random.randint(100, 9999)
    while True:
        if MATRIZ_RAM[indice_relogio][3] == 0 and EP > MATRIZ_RAM[indice_relogio][5]:
            # Substitua a página
            MATRIZ_SWAP[MATRIZ_RAM[indice_relogio][0]] = MATRIZ_RAM[indice_relogio]
            MATRIZ_RAM[indice_relogio] = MATRIZ_SWAP[random.randint(0, 99)].copy()
            return
        else:
            # Avance o índice do relógio e continue procurando uma página para substituir
            indice_relogio = (indice_relogio + 1) % len(MATRIZ_RAM)

# Função para substituir uma página
def substitui_pagina(instrucao):
    # Chamando o algoritmo de substituição
    substitui_paginaFIFO()
    

# Impressão dos resultados
print("--------------------------Início da execução----------------------------------------")
printarMatriz(MATRIZ_RAM)
printarMatriz(MATRIZ_SWAP)
for _ in range(1000):
    executaInstrucao(random.randint(1, 100))
print("----------------------------Fim da execução---------------------------------------")
printarMatriz(MATRIZ_RAM)
printarMatriz(MATRIZ_SWAP)
