import random

#o elemento inteiro "101" não é incluído no array final gerado pela função range()!
arrays = [list(range(0,101)), list(range(0,1001)), list(range(0,10001))]
listasInvertidas = []
listasRandom = []

for i in arrays:
    listasInvertidas.append(i.reverse())
    listasRandom.append(random.shuffle(i))
    arrays.append(listasInvertidas)
    arrays.append(listasRandom)

def QuickSort(array):
    ajudadora(array, 0, len(array) - 1)

def ajudadora(array, pri, ult):
    if pri<ult:

        meio = particao(array, pri, ult)

        ajudadora(array, pri, meio - 1)
        ajudadora(array, meio + 1, ult)

def particao(array, pri, ult):
    pivo = array[pri]

    esquerda = pri + 1
    direita = ult

    feito = False 

    while not feito:
        while esquerda <= direita and array[esquerda] <= pivo:
            esquerda += 1
        while array[direita] >= pivo and direita >= esquerda:
            direita -= 1

        if direita < esquerda:
            feito = True 
        else:
            array[direita], array[esquerda] = array[esquerda], array[direita]

    array[direita], array[esquerda] = array[esquerda], array[direita]

    return direita        

for i in arrays:
    QuickSort(i)
    print(i)