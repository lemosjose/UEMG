#include <stdio.h>
#include <stdlib.h>

typedef struct Fila{
	int fim;
	int elementos[5];
}Fila;

void inicializa(Fila *fila){
	fila->fim = -1;
}

int menu(){
	int o;
	printf("-----------------------\n");
	printf("-------Menu-----------\n");
	printf("----------------------\n");
	printf("(1) - Insere Elemento na fila\n");
	printf("(2) - Remove Elemento da Fila\n");
	printf("(3) - Confere Estado da Fila\n");
	printf("(0) - Sai do programa \n");
	scanf("%d", &o);
	system("cls");
	return o;
}

void insereFila(int e, Fila *f){
	if(f->fim == 4){
	   printf("não pode inserir mais elementos, a fila está cheia \n");
	}else{
	   f->fim++;
	   f->elementos[f->fim] = e;
	}
}
void removeFila(Fila *f){
	int i;
	printf("o elemento %d foi removido diretamente do início da fila \n", f->elementos[0]);
	if(f->fim == -1){
		printf("não há o que remover, fila vazia \n");
	}
	else{
	   for(i=1;i<=f->fim;i++){
	      f->elementos[i-1] = f->elementos[i];
	   }
	   f->fim--;
	}
	
}
void confereFila(Fila *f){
	int i;
	
	if(f->fim == -1){
	   printf("a fila está vazia \n");
	}else if(f->fim == 4){
		printf("a fila está cheia \n");
	}
	for(i=0;i<=f->fim; i++){
	   printf("- %d", f->elementos[i]);
	}
}

int main(){
	int elemento;
	int opc;
	Fila vetor;
	inicializa(&vetor);
	do{
	   opc = menu();
	   if(opc == 1){
	      printf("Digite o elemento a ser inserido \n");
	      scanf("%d", &elemento);
	      insereFila(elemento, &vetor);
	   }else if(opc == 2){
	      printf("Um elemento foi removido. \n");
	      removeFila(&vetor);
	   }
	   else if(opc == 3){
	      confereFila(&vetor);
	   }else if(opc > 3 && opc < 0){
	      printf("opção inválida \n");
	   }
	}while(opc != 0);
	return 0;
}
