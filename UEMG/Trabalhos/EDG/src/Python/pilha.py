import typing 
import sys 

pilha = []

def printMenu() -> int:
    print(" ---- Menu -------- \n")
    print(" 1 - Inserir na pilha \n")
    print(" 2 - Remover na pilha \n")
    print(" 3 - Printar a pilha atual \n")
    print(" 0 - Sair do programa")
    opc = int(input("Digite sua escolha:"))
    return opc

def main():
    while True:
        opc =  printMenu()
        match opc:
            case 1:
                elemento = int(input("digite o elemento a ser inserido \n"))
            case 2:
                if not len(pilha) == 0:
                    pilha.pop()
                else:
                    print("fila está vazia, não há o que remover")
            case 3:
                for x in pilha:
                    print(f"{x} - \n")
            case 0:
                break
            case _: 
                print("opção inválida")

main()
