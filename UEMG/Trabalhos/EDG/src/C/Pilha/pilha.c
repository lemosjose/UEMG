#include <stdio.h>
#include <stdlib.h>

typedef struct pilha{
	int topo;
	int itens[5];
}pilha;

int printMenu(){
	int opc;
	printf("----- Menu -------- \n");
	printf(" 1 - Inserir elemento na pilha \n");
	printf(" 2 - Remover elemento na pilha \n");
	printf(" 3 - Imprimir a pilha atual \n");
	printf(" 0 - Sair do programa \n");
	scanf("%d", &opc);
	return opc ; 
}

void inserirPilha(int e, pilha *p){
	if(p->topo == 4){
		printf("Pilha cheia, não é possível inserir. \n");
	}
	else{
		p->topo++;
		p->itens[p->topo] = e; 
	}
}

void removerPilha(pilha *p){
	int elementoRemovido;
	if(p->topo == -1){
		printf("-- Pilha vazia! não há o que remover -- \n");
	}
	else{
		elementoRemovido = p->itens[p->topo];
		p->topo--;
		printf("O elemento %d foi removido da pilha \n", elementoRemovido);
	}
}

void printPilha(pilha *p){
	int i; 
	if(p->topo == 4){
		printf("-- pilha atualmente está cheia --- \n");
	}
	else if(p->topo == -1){
		printf("--- pilha atualmente está vazia  ---- \n");
	}
	if(p->topo != -1){
		printf("Sua pilha atual é");
		for(i=0;i<=p->topo;i++){
			printf("[%d] -", p->itens[i]);
		}
	}
	printf("\n\n");
}

int main(){
	int opc, elemento;
	pilha p; 
	p.topo = -1;
	do{
		opc = printMenu();
		switch(opc){
			case 1:
				printf("Digite um elemento a ser inserido na pilha \n");
				scanf("%d", &elemento);
				inserirPilha(elemento, &p);
				break;
			case 2:
				printf("Removendo um elemento na pilha. (ou não)\n");
				removerPilha(&p);
				break;
			case 3:
				printPilha(&p);
				break;
			case 0:
				printf("Por hoje é só. \n");
				break;
			default:
				printf("Opção inválida");
				break;
		}
	}while(opc != 0);
	return 0;
}
