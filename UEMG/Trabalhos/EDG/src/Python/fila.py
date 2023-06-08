import typing 
import sys 
from collections import deque

fila = deque()

def printMenu() -> int:
    print(" ---- Menu -------- \n")
    print(" 1 - Inserir na fila \n")
    print(" 2 - Remover na fila \n")
    print(" 3 - Printar a fila atual \n")
    print(" 0 - Sair do programa")
    opc = int(input("Digite sua escolha:"))
    return opc

def main():
    while True:
        opc =  printMenu()
        match opc:
            case 1:
                elemento = int(input("Digite um elemento a ser inserido \n"))
                fila.append(elemento)
            case 2:
                if len(fila) == 0:
                    print("Não há o que remover, fila vazia \n")
                else:
                    fila.popleft()
            case 3: 
                for x in fila:
                    print(f"{x} - ")
            case 0:
                break
            case _: 
                print("opção inválida \n")

main()
