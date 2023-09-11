# NOTES: tri - triangular (para inferior e superior)

import typing 
import numpy as np

#preferi não usar como retorno das funções inputMatriz, mas é possível.
matriz = []
b = [] 


def inputMatriz():
    for i in range(3):
        matrizTemp = []
        for j in range(3):
            matrizTemp.append(float(input("digite o elemento a ser inserido ")))
        matriz.append(matrizTemp)
def inputMatrizB():
    for i in range(3):
        b.append(float(input(f"digite o elemento b{i} da matriz aumentada do sistema")))


def triSuperior(U,b):
    n = len(b)
    x = [0]*n
    x[n - 1] = b[n-1]/U[n-1][n-1]
    #list() para garantir a estrutura de dados correta
    for i in list(range(n-1,0,-1)):
        s = 0
        for j in list(range(i+1,n+1,1)):
            s = s + U[i-1][j-1]*x[j-1]
        x[i-1] = (b[i-1] - s)/(U[i-1][i-1])

    return x
    
def triInferior(L, b):
    n = len(b)
    y = [0]*n

    for i in list(range(1, n+1, 1)):
        s = 0
        for j in list(range(1,i,1)):
            s = s + L[i-1][j-1]*y[j-1]
        y[i - 1] = b[i-1] - s

    return y

# principal, mutando a matriz que recebe como argumento ao invés de gerar uma nova 
def fatoraLU(A):
    n = len(A)
    x = [0]*n

    for k in list(range(1,n,1)):
        for i in list(range(k+1,n+1,1)):
            m = A[i-1][k-1]/A[k-1][k-1]
            A[i-1][k-1] = m
            for j in list(range(k+1,n+1,1)):
                A[i-1][j-1] = A[i - 1][j-1]-m*A[k-1][j-1]
    return A


inputMatriz()
inputMatrizB()
print("matriz inserida pelo usuário:")

for i in matriz:
    print(f"{i} \n")

print("fatoração:")
fatoraLU(matriz)
for i in matriz:
    print(f"{i} \n")
y = triInferior(matriz, b)
print("y = ", y)
x = triSuperior(matriz, y)
print("x = ", x)
