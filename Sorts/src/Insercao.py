import random

listas = [list(range(0,101)), list(range(0,1001)), list(range(0,10001))]
listasInvertidas = []
for i in listas:
    listasInvertidas.append(i.reverse())
listasRandom = []
for i in listas:
    listasRandom.append(random.shuffle(i))

def InsertionSort(SortArray):
    for i in range(1, len(SortArray)):
        j = i  - 1 #para controle futuro
        while (i -1) >= 0 and (SortArray[i] < SortArray[i-1]):
            SortArray[i] = SortArray[i - 1]
            j -= 1
        SortArray[j + 1] = SortArray[i]


for i in listas:
    InsertionSort(i)
    print(i)
    print("\n\n")
for i in listasInvertidas:
    InsertionSort(i)
    print(i)
    print("\n\n")
for i in listasRandom:
    InsertionSort(i)
    print(i)
    print("\n\n")