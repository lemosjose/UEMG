import typing 
import sys
from collections import deque

lista = deque()
 

def printMenu() -> int:
    print(" ---- Menu -------- \n")
    print(" 1 - Inserir na fila à direita \n")
    print(" 2 - Inserir na fila à esquerda \n")
    print(" 3 - Remover um elemento da fila \n")
    print(" 4 - Printar a fila atual \n")
    opc = int(input("Digite sua escolha:"))
    return opc

def main():
    while True:
        opc =  printMenu()
        match opc:
            case 1:
                elemento = int(input("Digite o elemento a ser inserido à direita na lista"))
                lista.append(elemento)
            case 2:
                elemento = int(input("digite o elemento a ser inserido na esquerda da lista"))
                lista.appendleft(elemento)
            case 3:
                elemento = int(input("Digite o elemento a ser removido"))
                lista.remove(elemento)
            case 4:
                for x in lista:
                    print(f"{x} -")
            case 0:
                break
            case _: 
                print("opção inválida")

main()
