# Estrutura-de-Dados-e-Algoritmos
COMANDO PARA RODAR = javac *.java
java Principal 

>>LAÇO DA PILHA EXPLICACAO: topo e igual a null? NAO, entao topo NEXTGETNO, topo e igual a null, SIM entao topo null -- pilha vazia
>>NO tem um dado tipo T no caso do codigo 03, ele guarda este dado 
>>AUX referencia para imprimir estes dados que estao nos NOS
>>AUX definido com o mesmo tipo do objeto so pode referenciar os dados do tipo dele
>>STACK -- memoria pequena e guarda as referencias
>>HEAP --memoria grande que guarda os objetos
>>Classe principal nao exerga o NO, mas sim a pilha que é a estrutura dos NOS

PUSH -- EMPILHA
POP -- REMOVE
PEEK -- APONTA E RETORNA O ELEMENTO

pilha.push("B") insere "B" no topo da pilha
pilha.peek() retorna o elemento do topo sem removê-lo → imprime B, e o elemento continua na pilha
pilha.pop() retorna o elemento do topo e o remove → imprime B novamente, mas agora a pilha fica vazia.

>>STACK -- CRIA OS PONTEIROS (NOS)<<
>>HEEP -- CRIA OS DADOS REAIS QUE SERAO APRESENTADOS PELOS PONTEIROS<<

LISTA NORMAL -- 1 PONTEIRO; LISTA BASICA
LISTA DUPLA -- 2 PONTEIROS (ANTERIOR NO, PROXIMO NO) DEVEMOS ENCADEAR CADA UM DE "MAOS" DADAS PARA QUE NENHUM SEJA PERDIDO, ASSIM NAO SE PERDE DADOS, AMARRASE O NO ANAO SER QUE SEJA EXCLUIDO; 
DEVE SE SABER O TAMANHO E INDICE DESTA LISTA
