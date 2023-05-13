//código atualmente quebrado, implementação será refeita

#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

typedef struct linkedList{
	int posProximoElemento;
	int posElemento;
	int elemento;
	struct linkedlist* proxElemento; 
} LinkedList;

LinkedList* raiz = NULL; 

int mostraMenu(){
	int opc;
	printf("------- Menu ------- \n");
	printf("(1) - Insere elementos na lista \n");
	printf("(2) - Remove um elemento na lista\n");
	printf("(3) - Mostra a lista atual\n");
	printf("(0) - Sai do programa \n");
	scanf("%d", &opc);
	return opc;
}

void insereLista(int posElemento, int elemento, int posProximoElemento){
	//todo elemento inserido é uma lista, considerando que a LinkedList, como diz o nome, consiste na verdade de várias listas ligadas umas às outras
	LinkedList* inserido = (LinkedList*) malloc(sizeof(LinkedList));

	// cria a lista que será ligada às outras (lembra bastante uma classe......)
	inserido->posElemento = posElemento;
	inserido->elemento = elemento;
	inserido->posProximoElemento = posProximoElemento;
	inserido->proxElemento = NULL;

	//a lista atual será apenas o novo elemento
	if(raiz == NULL){
		raiz = inserido;
	}else{
		LinkedList* atual = raiz;
		while(atual->proxElemento != NULL){
			atual = atual->proxElemento;
		}
		atual->proxElemento = inserido;
	}
}

void removeLista(int posElemento){
	if(raiz == NULL){
		printf("A lista raiz está vazia, não há o que imprimir. \n");
	}else{
		LinkedList* atual = raiz;
		LinkedList* anterior = NULL;
		while(atual != NULL && atual->posElemento != posElemento){
			anterior = atual;
			atual = atual->proxElemento;
		}
		if(atual == NULL){
			printf("Posição não encontrada na lista \n");
		}
		else if (anterior == NULL){
			raiz = atual->proxElemento;
			free(atual);
			printf("Posição do elemento removida com sucesso");
		}

	}
}

void imprimelista(){
	LinkedList* atual = raiz;
	while(atual != NULL){
		printf("Posição atual: %d", atual->posElemento);
		printf("Elemento: %d", atual->elemento);
		printf("Posição do próximo elemento %d \n", atual->posProximoElemento);
		atual = atual->proxElemento;
	}
	if(raiz == NULL){
		printf("você está tentando imprimir uma lista vazia");
	}
}

int main(){
	//conserta oa acentos 
	setlocale(LC_ALL, "Portuguese");

	int elemento, posElemento, posProximoElemento, opc;
	do{
		opc = mostraMenu();
		switch(opc){
			case 1:
				printf("Digite o elemento a ser inserido \n");
				scanf("%d", &elemento);
				printf("Digite a posição do próximo elemento \n");
				scanf("%d", &posProximoElemento);
				printf("Digite a posição do Elemento \n");
				scanf("%d", &posElemento);
				insereLista(posElemento, elemento, posProximoElemento);
				break;
			case 2:
				printf("Digite a posição a ser removida da lista raiz \n");
				scanf("%d", &posElemento);
				break;
			case 3:
				imprimelista();
				printf("\n\n");
				break;
			default:
				printf("opção inválida \n");
				system("pause");
				 break;
		}
	}while(opc != 0);

	return 0;
}
