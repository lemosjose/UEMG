import random

listas = [list(range(0,101)), list(range(0,1001)), list(range(0,10001))]
listasInvertidas = []
for i in listas:
    listasInvertidas.append(i.reverse())
listasRandom = []
for i in listas:
    listasRandom.append(random.shuffle(i))

def SelectionSort(SortArray):
    for i in range(len(SortArray)):
        backup = i 

        for j in range(i + 1, len(SortArray)):
            if SortArray[j] < SortArray[backup]:
                backup = j
            SortArray[i], SortArray[backup] = SortArray[backup], SortArray[i]

for i in listas:
    SelectionSort(i)
    print(i)
    print("\n\n")
for i in listasInvertidas:
    SelectionSort(i)
    print(i)
    print("\n\n")
for i in listasRandom:
    SelectionSort(i)
    print(i)
    print("\n\n")