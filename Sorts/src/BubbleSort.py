import random

listas = [list(range(0,101)), list(range(0,1001)), list(range(0,10001))]
listasInvertidas = []
for i in listas:
    listasInvertidas.append(i.reverse())
listasRandom = []
for i in listas:
    listasRandom.append(random.shuffle(i))

def BubbleSort(sortArray):
    executouTroca = False
    for i in range(len(sortArray)):
        for j in range(0, len(sortArray) - i - 1):
           if sortArray[j] > sortArray[j+1]:
               #executa o swap
               sortArray[j], sortArray[j+1] = sortArray[j+1], sortArray[j]
               executouTroca = True 
        if(executouTroca == False):
            break

for i in listas:
    BubbleSort(i)
    print(i)
for i in listasInvertidas:
    BubbleSort(i)
    print(i)
for i in listasRandom:
    BubbleSort(i)
    print(i)
    print("\n\n")