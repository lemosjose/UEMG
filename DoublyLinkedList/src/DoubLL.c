#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

typedef struct No{
	int elemento;
	struct No* proxNo;
	struct No* antNo;
} NoLista;

typedef struct{
	NoLista* inicio;
	NoLista* fim;
} DoublyLinked;

int exibirMenu(){
	int opc;
	printf("------- Menu ------ \n");
	printf(" 1 - Insere elemento no início \n");
	printf(" 2 - Insere elemento no fim \n");
	printf(" 3 - Remove Elemento \n");
	printf(" 4 - Imprime a lista \n");
	printf(" 0 - Sai do programa \n");
	scanf("%d", &opc);
	return opc;
}

NoLista* iniciarNo(int elemento){
	NoLista* novoNo = (NoLista*)malloc(sizeof(NoLista));
	novoNo->elemento = elemento;
	novoNo->proxNo = NULL;
	novoNo->antNo = NULL;

	return novoNo;

}

void inserirInicio(DoublyLinked* lista, int elemento){
	NoLista* No = iniciarNo(elemento);
	if(lista->inicio == NULL){
		lista->inicio = No;
		lista->fim = No;
	}else{
		No->proxNo = lista->inicio;
		lista->inicio->antNo = No;
		lista->inicio = No;
	}
}

void inserirFim(DoublyLinked* lista, int elemento){
	NoLista* No = iniciarNo(elemento);
	if(lista->inicio == NULL){
		lista->inicio = No;
		lista->fim=No;
	}else{
		No->antNo = lista->fim;
		lista->fim->proxNo = No;
		lista->fim = No;
	}
}
void removeElemento(DoublyLinked* lista, int elemento){
	if(lista->inicio == NULL){
		printf("Não há o que remover, lista vazia.");
		return;
	}

	NoLista* atual = lista->inicio;
	while(atual != NULL){
		if(atual->elemento == elemento){
			if(atual == lista->inicio){
				lista->inicio = atual->proxNo;
				if(lista->inicio != NULL){
					lista->inicio->antNo = NULL;
				}
				free(atual);
			}
			else if(atual == lista->fim){
				lista->fim = atual->antNo;
				lista->fim->proxNo = NULL;
				free(atual);
			}
			else{
				atual->antNo->proxNo = atual->proxNo;
				atual->proxNo->antNo = atual->antNo;
			}
			printf("\n Elemento removido com sucesso");
			return;
		}
		atual = atual->proxNo;
	}
	printf("\n Elemento não foi encontrado na lista \n");
}

void imprimirLista(DoublyLinked* lista){
	NoLista* atual = lista->inicio;
	printf("Lista: \n");
	while(atual != NULL){
		printf("[ %d ] - ", atual->elemento);
		atual = atual->proxNo;
	}
}

int main(){
	int opcao, elemento;
 	DoublyLinked raiz;
	raiz.inicio = NULL;
	raiz.fim = NULL;
	do{
 		opcao = exibirMenu();
		switch(opcao){
			case 1:
				//insereinicio
			   printf("Digite o elemento a ser inserido no inicio da lista: ");
			   scanf("%d", &elemento);
			   inserirInicio(&raiz, elemento);
			   break;
			case 2:
				//inserefim
			   printf("Digite o elemento a ser inserido no fim da lista: ");
			   scanf("%d", &elemento);
			   inserirFim(&raiz, elemento);
			   break;
			case 3:
				//remove (qualquer elemento da lista)
			   printf("Digite o elemento a ser removido: ");
			   scanf("%d", &elemento);
			   removeElemento(&raiz, elemento);
			   printf("\n\n");
			   break;
			case 4:
				//imprime lista
			   imprimirLista(&raiz);
			   printf("\n\n");
			   break;
			case 0:
			   printf("Saindo do programa.");
			   break;
			default:
			   printf("Opção inválida");
			   break;

	      }
	}while(opcao != 0);
	return 0;
}
