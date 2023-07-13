import random

#o elemento inteiro "101" não é incluído no array final gerado pela função range()!
arrays = [list(range(0,101)), list(range(0,1001)), list(range(0,10001))]
listasInvertidas = []
listasRandom = []

def gapFix(lista, start, gap):
    for i in range(start + gap, len(lista), gap):
        valor = lista[i]
        pos = i

        while pos>=gap and lista[pos - gap]>valor:
            lista[pos] = lista[pos - gap]
            pos = pos - gap

        lista[pos] = valor


def ShellSort(array):
    while len(array)//2 > 0: 
        for i in range(len(array)//2):
            gapFix(array, i, len(array)//2)
    print("little placeholder") 

for i in arrays:
    listasInvertidas.append(i.reverse())
    listasRandom.append(random.shuffle(i))
for i in arrays:
    ShellSort(i)
    print(i)