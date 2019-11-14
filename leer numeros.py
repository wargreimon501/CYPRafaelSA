archivo= open("numeros.txt","rt")
#print(dir(archivo))





numeros1=archivo.read()
print(numeros1)
print(numeros1.split('\n'))
lista_num=[]
for linia in numeros1.split('\n'):
    for numero in linia.split(','):
        lista_num.append(int(numero))

print("-------")
print(lista_num)
print("------------")
lista_num.sort()

print(f"el mayor es:{lista_num[-1]}y el menor es:{lista_num[0]}")
archivo.close()
archivo=open("numeros.txt","rt")
numeros2=archivo.readlines()
print(numeros2)
archivo.close()

archivo=open("numeros.txt","rt")
numeros2=archivo.readline()
print(numeros2)
archivo.close()
lista_num2=[]
for linia in numeros2.split('\n'):
    for numero in linia.split(','):
        lista_num2.append(int("numero"))

print("-------")
print(lista_num2)
print("------------")
lista_num.sort()

print(f"el mayor es:{lista_num2[-1]}y el menor es:{lista_num2[0]}")

